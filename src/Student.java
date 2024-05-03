public class Student {
    private static int nextID = 1;
    private String firstName;
    private String lastName;
    private String studentID;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = generateID();
    }

    private String generateID() {
        String id = String.format("%03d", nextID);
        nextID++;
        return id;
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


