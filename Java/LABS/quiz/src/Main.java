
        public class Main {
            public static void main(String[] args) {

                Days[] calismaGunleri1 = { Days.PAZARTESI, Days.SALI, Days.CARSAMBA };
                Employee employee1 = new Employee("Ahmet", calismaGunleri1);
                employee1.printEmployeeInfo();


                Days[] calismaGunleri2 = { Days.PERSEMBE, Days.CUMA };
                Employee employee2 = new Employee("Mehmet", calismaGunleri2);
                employee2.printEmployeeInfo();

                System.out.println("Toplam Çalışan Sayısı: " + Employee.getTotalEmployees());
            }
        }


