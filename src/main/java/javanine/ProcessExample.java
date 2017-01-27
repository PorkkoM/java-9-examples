package javanine;

public class ProcessExample {

    public static void main(String[] args) {
        ProcessHandle.allProcesses().forEach(ProcessExample::print);
    }

    private static void print(ProcessHandle process) {
        System.out.println("PID: " + process.getPid());
        process.parent().ifPresent(parent -> System.out.println(parent.getPid()));
    }
}
