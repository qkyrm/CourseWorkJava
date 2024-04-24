public class Student {

        // Поля класса
        private String firstName;
        private String lastName;
        private String studentID;

        // Конструктор для инициализации объекта класса Student
        public Student(String firstName, String lastName, String studentID) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.studentID = studentID;
        }

        // Геттеры для доступа к полям класса
        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getStudentID() {
            return studentID;
        }

        // Сеттеры для изменения значений полей класса
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setStudentID(String studentID) {
            this.studentID = studentID;
        }
    }


