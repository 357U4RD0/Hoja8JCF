import java.io.BufferedReader;
import java.io.FileReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Pacientes> queue = new PriorityQueue<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("pacientes.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String name = parts[0].trim();
                    String symptom = parts[1].trim();
                    char emergencyCode = parts[2].trim().charAt(0);
                    Pacientes patient = new Pacientes(name, symptom, emergencyCode);
                    queue.add(patient);
                } else {
                    System.out.println("Advertencia: La línea \"" + line + "\" no sigue el formato esperado.");
                }
            }

            while (!queue.isEmpty()) {
                System.out.println(queue.poll());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
