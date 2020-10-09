import java.sql.SQLException;
import java.time.LocalDate;

public class TestingPatient {
    public static void main(String[] args) {
        try {
            Patient newPatient = new Patient("Barney","Rubble","705 456 1234","15 Granite Way",
                    "Bedrock","ON", LocalDate.of(1986,02,16));
            System.out.println("The patientID is: "+newPatient.getPatientID());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
