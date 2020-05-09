import java.util.Scanner;

/* yudhishthirsingh created on 09/05/20 inside the package - PACKAGE_NAME */
public class Runner {
    public static void main(String[] args) {
        Heap<Integer> hp = new Heap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter next int, \"done\" to stop:");
        String line = sc.next();
        while(!line.equals(("done"))) {
            hp.insert(Integer.parseInt(line));
            System.out.println(hp);
            System.out.println("Enter next int, \"done\" to stop:");
            line = sc.next();
        }

        while(!hp.isEmpty()) {
            int max = hp.delete();
            System.out.println(max + " " + hp);
        }
    }
}
