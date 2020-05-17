package com.bsuir.clinic.website;

import com.bsuir.clinic.website.entity.Clinic;
import com.bsuir.clinic.website.entity.ClinicDepartment;
import com.bsuir.clinic.website.entity.Doctor;
import com.bsuir.clinic.website.entity.Patient;
import com.bsuir.clinic.website.service.ClinicService;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

@SpringBootApplication
public class WebSiteMain extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(WebSiteMain.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(WebSiteMain.class, args);
    }

    @Bean
    public CommandLineRunner initDatabase(ClinicService clinicService) {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                Clinic clinic = clinicService.createClinic();
                //создание отделений клиники
                ClinicDepartment clinicDepartmentOne = clinicService.createClinicDepartment(clinic, "Терапевтическое 1", Arrays.asList("Кунцевщина", "Притыцкого"));
                ClinicDepartment clinicDepartmentTwo = clinicService.createClinicDepartment(clinic, "Терапевтическое 2", Arrays.asList("Лидская", "Неманская"));
                ClinicDepartment clinicDepartmentThree = clinicService.createClinicDepartment(clinic, "Стоматологическое", Arrays.asList("Лидская", "Неманская", "Притыцкого", "Кунцевщина"));
                ClinicDepartment clinicDepartmentFour = clinicService.createClinicDepartment(clinic, "Неврологическое", Arrays.asList("Лидская", "Неманская", "Притыцкого", "Кунцевщина"));
                ClinicDepartment clinicDepartmentFive = clinicService.createClinicDepartment(clinic, "Травматологическое", Arrays.asList("Лидская", "Неманская", "Притыцкого", "Кунцевщина"));

                //Doctor rootDoctor = new Doctor("root", "root", clinicDepartmentOne);
                //clinicService.createOrUpdateDoctor(rootDoctor);

                //пример создания доктора
                Doctor testDoctor = new Doctor("laguna", "laguna", clinicDepartmentOne);
                testDoctor.setName("Елизавета");
                testDoctor.setSurname("Лагуновская");
                testDoctor.setPhoneNumber("80299339992");
                testDoctor.setBirthDate(DateUtils.addYears(new Date(), -20));//сегодняшняя дата(new Date) - 20 лет = дата рождения 20летней пухляшки
                clinicService.createOrUpdateDoctor(testDoctor);

                Doctor testDoctor1 = new Doctor("gorin", "gorin", clinicDepartmentOne);
                testDoctor1.setName("Александр");
                testDoctor1.setSurname("Горин");
                testDoctor1.setPhoneNumber("80291234578");
                testDoctor1.setBirthDate(DateUtils.addYears(new Date(), -40));//сегодняшняя дата(new Date) - 20 лет = дата рождения 20летней пухляшки
                clinicService.createOrUpdateDoctor(testDoctor1);

                Doctor testDoctor2 = new Doctor("muhin", "muhin", clinicDepartmentOne);
                testDoctor2.setName("Федор");
                testDoctor2.setSurname("Мухин");
                testDoctor2.setPhoneNumber("80291209453");
                testDoctor2.setBirthDate(DateUtils.addYears(new Date(), -45));//сегодняшняя дата(new Date) - 20 лет = дата рождения 20летней пухляшки
                clinicService.createOrUpdateDoctor(testDoctor2);

                Doctor testDoctor3 = new Doctor("lapsh", "lapsh", clinicDepartmentOne);
                testDoctor3.setName("Ирина");
                testDoctor3.setSurname("Лапшина");
                testDoctor3.setPhoneNumber("80291230198");
                testDoctor3.setBirthDate(DateUtils.addYears(new Date(), -24));//сегодняшняя дата(new Date) - 20 лет = дата рождения 20летней пухляшки
                clinicService.createOrUpdateDoctor(testDoctor3);

                Doctor testDoctor4 = new Doctor("dudo", "dudo", clinicDepartmentOne);
                testDoctor4.setName("Евгения");
                testDoctor4.setSurname("Дудо");
                testDoctor4.setPhoneNumber("80299076281");
                testDoctor4.setBirthDate(DateUtils.addYears(new Date(), -21));//сегодняшняя дата(new Date) - 20 лет = дата рождения 20летней пухляшки
                clinicService.createOrUpdateDoctor(testDoctor4);

                Doctor testDoctor5 = new Doctor("kozlo", "kozlo", clinicDepartmentTwo);
                testDoctor5.setName("Алина");
                testDoctor5.setSurname("Козлова");
                testDoctor5.setPhoneNumber("80292910954");
                testDoctor5.setBirthDate(DateUtils.addYears(new Date(), -22));//сегодняшняя дата(new Date) - 20 лет = дата рождения 20летней пухляшки
                clinicService.createOrUpdateDoctor(testDoctor5);

                Doctor testDoctor6 = new Doctor("slav", "slav", clinicDepartmentTwo);
                testDoctor6.setName("Валентина");
                testDoctor6.setSurname("Славинская");
                testDoctor6.setPhoneNumber("80296753298");
                testDoctor6.setBirthDate(DateUtils.addYears(new Date(), -50));//сегодняшняя дата(new Date) - 20 лет = дата рождения 20летней пухляшки
                clinicService.createOrUpdateDoctor(testDoctor6);

                Doctor testDoctor7 = new Doctor("belik", "belik", clinicDepartmentTwo);
                testDoctor7.setName("Алексей");
                testDoctor7.setSurname("Белявский");
                testDoctor7.setPhoneNumber("80299864512");
                testDoctor7.setBirthDate(DateUtils.addYears(new Date(), -30));//сегодняшняя дата(new Date) - 20 лет = дата рождения 20летней пухляшки
                clinicService.createOrUpdateDoctor(testDoctor7);

                Doctor testDoctor8 = new Doctor("utug", "utug", clinicDepartmentTwo);
                testDoctor8.setName("Григорий");
                testDoctor8.setSurname("Утюгов");
                testDoctor8.setPhoneNumber("80299873209");
                testDoctor8.setBirthDate(DateUtils.addYears(new Date(), -26));//сегодняшняя дата(new Date) - 20 лет = дата рождения 20летней пухляшки
                clinicService.createOrUpdateDoctor(testDoctor8);

                Doctor testDoctor9 = new Doctor("malish", "malish", clinicDepartmentTwo);
                testDoctor9.setName("Виталий");
                testDoctor9.setSurname("Малышев");
                testDoctor9.setPhoneNumber("80299816712");
                testDoctor9.setBirthDate(DateUtils.addYears(new Date(), -29));//сегодняшняя дата(new Date) - 20 лет = дата рождения 20летней пухляшки
                clinicService.createOrUpdateDoctor(testDoctor9);

                Doctor testDoctor10 = new Doctor("gordon", "gordon", clinicDepartmentThree);
                testDoctor10.setName("София");
                testDoctor10.setSurname("Гордон");
                testDoctor10.setPhoneNumber("8029092312");
                testDoctor10.setBirthDate(DateUtils.addYears(new Date(), -22));//сегодняшняя дата(new Date) - 20 лет = дата рождения 20летней пухляшки
                clinicService.createOrUpdateDoctor(testDoctor10);

                Doctor testDoctor11 = new Doctor("kuzen", "kuzen", clinicDepartmentThree);
                testDoctor11.setName("Елизавета");
                testDoctor11.setSurname("Кузенкова");
                testDoctor11.setPhoneNumber("8029760923");
                testDoctor11.setBirthDate(DateUtils.addYears(new Date(), -25));//сегодняшняя дата(new Date) - 20 лет = дата рождения 20летней пухляшки
                clinicService.createOrUpdateDoctor(testDoctor11);

                Doctor testDoctor12 = new Doctor("lebed", "lebed", clinicDepartmentThree);
                testDoctor12.setName("Олег");
                testDoctor12.setSurname("Лебедев");
                testDoctor12.setPhoneNumber("80295644523");
                testDoctor12.setBirthDate(DateUtils.addYears(new Date(), -28));//сегодняшняя дата(new Date) - 20 лет = дата рождения 20летней пухляшки
                clinicService.createOrUpdateDoctor(testDoctor12);

                Doctor testDoctor13 = new Doctor("drozd", "drozd", clinicDepartmentFour);
                testDoctor13.setName("Виталий");
                testDoctor13.setSurname("Дрозд");
                testDoctor13.setPhoneNumber("80299875408");
                testDoctor13.setBirthDate(DateUtils.addYears(new Date(), -38));//сегодняшняя дата(new Date) - 20 лет = дата рождения 20летней пухляшки
                clinicService.createOrUpdateDoctor(testDoctor13);

                Doctor testDoctor14 = new Doctor("melezh", "melezh", clinicDepartmentFour);
                testDoctor14.setName("Олег");
                testDoctor14.setSurname("Мележин");
                testDoctor14.setPhoneNumber("80299873412");
                testDoctor14.setBirthDate(DateUtils.addYears(new Date(), -32));//сегодняшняя дата(new Date) - 20 лет = дата рождения 20летней пухляшки
                clinicService.createOrUpdateDoctor(testDoctor14);

                Doctor testDoctor15 = new Doctor("trus", "trus", clinicDepartmentFour);
                testDoctor15.setName("Марина");
                testDoctor15.setSurname("Трусова");
                testDoctor15.setPhoneNumber("80299085645");
                testDoctor15.setBirthDate(DateUtils.addYears(new Date(), -28));//сегодняшняя дата(new Date) - 20 лет = дата рождения 20летней пухляшки
                clinicService.createOrUpdateDoctor(testDoctor15);

                Doctor testDoctor16 = new Doctor("lapup", "lapup", clinicDepartmentFive);
                testDoctor16.setName("Василий");
                testDoctor16.setSurname("Лапупкин");
                testDoctor16.setPhoneNumber("80298975634");
                testDoctor16.setBirthDate(DateUtils.addYears(new Date(), -22));//сегодняшняя дата(new Date) - 20 лет = дата рождения 20летней пухляшки
                clinicService.createOrUpdateDoctor(testDoctor16);

                Doctor testDoctor17 = new Doctor("zavaz", "zavaz", clinicDepartmentFive);
                testDoctor17.setName("Алёна");
                testDoctor17.setSurname("Завацкая");
                testDoctor17.setPhoneNumber("80299084512");
                testDoctor17.setBirthDate(DateUtils.addYears(new Date(), -20));//сегодняшняя дата(new Date) - 20 лет = дата рождения 20летней пухляшки
                clinicService.createOrUpdateDoctor(testDoctor17);

                //пример создания пациента
                Patient testPatient = new Patient("pupkin", "pupkin", clinicDepartmentOne);
                testPatient.setName("Василий");
                testPatient.setSurname("Пупкин");
                testPatient.setPhoneNumber("80296739273");
                testPatient.setBirthDate(DateUtils.addYears(new Date(), -25));
                testPatient.setAddress("Минск, ул. Кунцевщина, дом 43");//единственное отличие от врача
                clinicService.createOrUpdatePatient(testPatient);

                Patient testPatient1 = new Patient("pyatir", "pyatir", clinicDepartmentOne);
                testPatient1.setName("Григорий");
                testPatient1.setSurname("Пятигорский");
                testPatient1.setPhoneNumber("80296758934");
                testPatient1.setBirthDate(DateUtils.addYears(new Date(), -20));
                testPatient1.setAddress("Минск, ул. Притыцкого, дом 66");//единственное отличие от врача
                clinicService.createOrUpdatePatient(testPatient1);

                Patient testPatient2 = new Patient("neva", "neva", clinicDepartmentOne);
                testPatient2.setName("Юрий");
                testPatient2.setSurname("Невский");
                testPatient2.setPhoneNumber("80296753209");
                testPatient2.setBirthDate(DateUtils.addYears(new Date(), -29));
                testPatient2.setAddress("Минск, ул. Притыцкого, дом 105");//единственное отличие от врача
                clinicService.createOrUpdatePatient(testPatient2);

                Patient testPatient3 = new Patient("arono", "arono", clinicDepartmentOne);
                testPatient3.setName("Юлия");
                testPatient3.setSurname("Аронова");
                testPatient3.setPhoneNumber("80298961212");
                testPatient3.setBirthDate(DateUtils.addYears(new Date(), -40));
                testPatient3.setAddress("Минск, ул. Притыцкого, дом 90");//единственное отличие от врача
                clinicService.createOrUpdatePatient(testPatient3);

                Patient testPatient4 = new Patient("maxim", "maxim", clinicDepartmentOne);
                testPatient4.setName("Ольга");
                testPatient4.setSurname("Максимова");
                testPatient4.setPhoneNumber("80298975412");
                testPatient4.setBirthDate(DateUtils.addYears(new Date(), -35));
                testPatient4.setAddress("Минск, ул. Кунцевщина, дом 6");//единственное отличие от врача
                clinicService.createOrUpdatePatient(testPatient4);

                Patient testPatient5 = new Patient("ivlev", "ivlev", clinicDepartmentTwo);
                testPatient5.setName("Ирина");
                testPatient5.setSurname("Ивлеева");
                testPatient5.setPhoneNumber("80290932567");
                testPatient5.setBirthDate(DateUtils.addYears(new Date(), -27));
                testPatient5.setAddress("Минск, ул. Неманская, дом 12");//единственное отличие от врача
                clinicService.createOrUpdatePatient(testPatient5);

                Patient testPatient6 = new Patient("avizh", "avizh", clinicDepartmentTwo);
                testPatient6.setName("Александр");
                testPatient6.setSurname("Авижень");
                testPatient6.setPhoneNumber("80299085465");
                testPatient6.setBirthDate(DateUtils.addYears(new Date(), -24));
                testPatient6.setAddress("Минск, ул. Неманская, дом 87");//единственное отличие от врача
                clinicService.createOrUpdatePatient(testPatient6);

                Patient testPatient7 = new Patient("filon", "filon", clinicDepartmentTwo);
                testPatient7.setName("Владимир");
                testPatient7.setSurname("Филонов");
                testPatient7.setPhoneNumber("80299078765");
                testPatient7.setBirthDate(DateUtils.addYears(new Date(), -34));
                testPatient7.setAddress("Минск, ул. Неманская, дом 90");//единственное отличие от врача
                clinicService.createOrUpdatePatient(testPatient7);

                Patient testPatient8 = new Patient("kulik", "kulik", clinicDepartmentTwo);
                testPatient8.setName("Анастасия");
                testPatient8.setSurname("Куликова");
                testPatient8.setPhoneNumber("80297865632");
                testPatient8.setBirthDate(DateUtils.addYears(new Date(), -44));
                testPatient8.setAddress("Минск, ул. Лидская, дом 17");//единственное отличие от врача
                clinicService.createOrUpdatePatient(testPatient8);

                Patient testPatient9 = new Patient("vishn", "vishn", clinicDepartmentTwo);
                testPatient9.setName("Кира");
                testPatient9.setSurname("Вишневская");
                testPatient9.setPhoneNumber("80299086512");
                testPatient9.setBirthDate(DateUtils.addYears(new Date(), -50));
                testPatient9.setAddress("Минск, ул. Лидская, дом 9");//единственное отличие от врача
                clinicService.createOrUpdatePatient(testPatient9);

                //искусственная генерация пациентов и врачей для тестирования
                //generatePatAndDoc(0, clinicDepartmentOne, clinicService);
                //generatePatAndDoc(20, clinicDepartmentTwo, clinicService);
            }
        };


    }

    private void generatePatAndDoc(int startIndex, ClinicDepartment clinicDepartment, ClinicService clinicService) {
        for (int i = startIndex; i < startIndex + 10; i++) {
            String tempWord = "testDoc" + i;
            Doctor currentDoctor = new Doctor(tempWord, tempWord, clinicDepartment);
            currentDoctor.setSurname(tempWord);
            currentDoctor.setName(tempWord);
            currentDoctor.setBirthDate(DateUtils.addYears(new Date(), -(20 + i)));
            clinicService.createOrUpdateDoctor(currentDoctor);
        }
        for (int i = startIndex + 10; i < startIndex + 20; i++) {
            String tempWord = "testPat" + i;
            Patient currentPatient = new Patient(tempWord, tempWord, clinicDepartment);
            currentPatient.setSurname(tempWord);
            currentPatient.setName(tempWord);
            currentPatient.setBirthDate(DateUtils.addYears(new Date(), -(20 + i)));
            clinicService.createOrUpdatePatient(currentPatient);
        }
    }
}
