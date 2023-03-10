import com.clinicmgmt.springclinicmgmt.dao.AuthGroupRepoI;
import com.clinicmgmt.springclinicmgmt.dao.DoctorsRepo;
import com.clinicmgmt.springclinicmgmt.dao.PatientsRepo;
import com.clinicmgmt.springclinicmgmt.models.AuthGroup;
import com.clinicmgmt.springclinicmgmt.models.Doctor;
import com.clinicmgmt.springclinicmgmt.services.DoctorService;
import com.clinicmgmt.springclinicmgmt.services.PatientService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j

public class MyCommandLineRunner implements CommandLineRunner {

    PatientsRepo patientsRepo;
    AuthGroupRepoI authGroupRepoI;
    DoctorsRepo doctorsRepo;
    DoctorService doctorService;
    PatientService patientService;
    @Autowired
    public MyCommandLineRunner(DoctorsRepo doctorsRepo, PatientService patientService, AuthGroupRepoI authGroupRepoI, PatientsRepo patientsRepo, DoctorService doctorService) {
        this.patientsRepo = patientsRepo;
        this.doctorsRepo = doctorsRepo;
        this.authGroupRepoI = authGroupRepoI;
        this.doctorService = doctorService;
        this.patientService = patientService;
    }

    @Override
    public void run(String... args) throws Exception {


        AuthGroup authGroup1 = new AuthGroup ("username","ROLE_ADMIN");
        AuthGroup authGroup2 = new AuthGroup ("username","ROLE_DOCTOR");

        AuthGroup authGroup3= new AuthGroup ("username","ROLE_RECEPTIONIST");

        authGroupRepoI.save(authGroup1);
        authGroupRepoI.save(authGroup2);
        authGroupRepoI.save(authGroup3);




        //Doctor doctor1 = new Doctor(doctor1.setUserName(Username););

       /* DoctorsRepo.save(doctor1);
        DoctorsRepo.save(doctor2);
        DoctorsRepo.save(doctor2);*/


    }
}