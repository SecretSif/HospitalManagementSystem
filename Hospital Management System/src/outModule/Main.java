package outModule;

import mainModule.*;
import subModule.*;
import java.util.Scanner;

public class Main {
    public static void clearScreen() {
        System.out.print("\u001b[2J\u001b[H");
        System.out.flush();
    }

    public static void template(){
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("                                                Daffodil Hospital Limited");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------\n");
    }
    public static void menu(){
        clearScreen();
        Scanner in = new Scanner(System.in);
        template();
        System.out.println("     1. Log In");
        System.out.println("     2. Exit");
        System.out.print("\n     Chose a option: ");
        int option = in.nextInt();
        if(option == 1){
            clearScreen();
            template();
            System.out.println("     Login as:");
            System.out.println("        1. Admin\n" +
                               "        2. Community Doctor\n" +
                               "        3. Hospital Doctor\n");
            System.out.print("\n     Choose a option: ");
            int option1 = in.nextInt();

            if(option1 == 1){
                Admin admin = new Admin();
                admin.menu();
            }
            if(option1 == 2){

                System.out.print("\n     Enter community doctorId: ");
                int doctorId = in.nextInt();
                CommunityDoctor cd = CommunityDoctor.communityDoctor.get(doctorId);
                cd.menu();
            }
            if(option1 == 3) {
                System.out.print("\n     Enter hospital doctorId: ");
                int doctorId = in.nextInt();
                HospitalDoctor hd = HospitalDoctor.hospitalDoctor.get(doctorId);
                hd.menu();
            }
        }
        if(option == 2){
            clearScreen();
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------\n");
            System.out.println("                                           Thanks for using Daffodil Hospital Limited");
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------\n");
        }
    }
    public static void main(String[] args) {

        Patient.patient.add(new Patient("Ariful Rahman", "Sylhet", "02/12/1998", "01762786263"));
        Patient.patient.add(new Patient("Jeba Wasima", "Bagura", "28/05/2000", "01762786263"));
        Patient.patient.add(new Patient("Nujhat Diba", "Dhaka", "28/05/2000", "01762786263"));
        Patient.patient.add(new Patient("Rimon Roy", "Bairob", "28/05/2000", "01762786263"));
        Patient.patient.add(new Patient("Rifat Mahmud", "Gazipur", "28/05/2000", "01762786263"));

        HospitalDoctor.hospitalDoctor.add(new HospitalDoctor("Dr.Moin Khan", "General Surgeon", "01394893780"));
        HospitalDoctor.hospitalDoctor.add(new HospitalDoctor("Dr.Zarif Mahmud", "Neurosurgeon", "01887394893"));
        HospitalDoctor.hospitalDoctor.add(new HospitalDoctor("Dr.Asif Ahmed", "Cardiothoracic Surgeon", "01887394893"));
        HospitalDoctor.hospitalDoctor.add(new HospitalDoctor("Dr.Fariha Islam Suborna", "Neurosurgeon", "01887394893"));

        CommunityDoctor.communityDoctor.add(new CommunityDoctor("Dr.Marif Hasan", "5017", "01909540465"));
        CommunityDoctor.communityDoctor.add(new CommunityDoctor("Dr.Jubayer Uddin", "5018", "01909540465"));
        CommunityDoctor.communityDoctor.add(new CommunityDoctor("Dr.Akash Chowdhury", "5019", "01909540465"));
        //cd.showPatient();
        Diagnosis.diagnosis.add(new Diagnosis("CT Scan"));
        Diagnosis.diagnosis.add(new Diagnosis("Urine Test"));
        Diagnosis.diagnosis.add(new Diagnosis("Blood Test"));
        Diagnosis.diagnosis.add(new Diagnosis("Endoscopy"));
        Diagnosis.diagnosis.add(new Diagnosis("Biopsy"));
        
        Medication.medication.add(new Medication("Paracetamol"));
        Medication.medication.add(new Medication("Antibiotics"));
        Medication.medication.add(new Medication("Adderall"));
        Medication.medication.add(new Medication("Amoxicillin"));
        Medication.medication.add(new Medication("Bactrim DS"));
        Medication.medication.add(new Medication("Propofol"));
        
        Surgery.surgery.add(new Surgery("General Surgery"));
        Surgery.surgery.add(new Surgery("Hand & Neck Surgery"));
        Surgery.surgery.add(new Surgery("Neurosurgery Surgery"));
        Surgery.surgery.add(new Surgery("Orthopedic Surgery"));

        Main.menu();
    }
}