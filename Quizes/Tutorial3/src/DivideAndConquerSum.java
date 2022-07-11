import java.util.concurrent.*;
import java.util.*;

public class DivideAndConquerSum extends RecursiveTask<Integer> {
    private static final int THRESHOLD = 4;
    private final int[] toSum;

    public DivideAndConquerSum(int[] input) {
        this.toSum = input;
    }

    @Override
    protected Integer compute() {
        // If the task is too big, split it into smaller tasks. Don't worry about this syntax for now
        // we will be covering streams in the next section of the lab.
        if (toSum.length > THRESHOLD) {
            System.out.println("Forking!");
            return ForkJoinTask.invokeAll(this.createSubtasks())
                    .stream()
                    .mapToInt(ForkJoinTask::join)
                    .sum();
        } else {
            System.out.println("Computing!");

            // Uncomment this line to see which thread each computation is occurring on
//            System.out.printf("On thread: %s%n", Thread.currentThread().getName());
            return this.sumRange(toSum);
        }
    }

    private Collection<DivideAndConquerSum> createSubtasks() {
        List<DivideAndConquerSum> dividedTasks = new ArrayList<>();

        // Create two new subtasks and add them to a list. Each subtask gets a copy of one half of the array.
        dividedTasks.add(new DivideAndConquerSum(Arrays.copyOfRange(toSum, 0, toSum.length / 2)));
        dividedTasks.add(new DivideAndConquerSum(Arrays.copyOfRange(toSum, toSum.length / 2, toSum.length)));
        return dividedTasks;
    }

    // Performs the actual computation by summing the elements in an array
    private Integer sumRange(int[] arr) {
        return Arrays.stream(arr).sum();
    }

    public static void main(String[] args) {
        // Create a fork/join pool.
        ForkJoinPool pool = ForkJoinPool.commonPool();

        int[] arrayToSum = {12,18,19,25,18,27,24,23,17,12,15,18,43,22,15,45,78,28,20,21};
        // Dispatch the task to the fork/join pool
        int result = pool.invoke(new DivideAndConquerSum(arrayToSum));

        System.out.printf("Result is %s%n", result);
    }
}