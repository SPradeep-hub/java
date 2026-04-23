class Student {
    String name;
    String regNo;
    long contactNo;

    Student(String name, String regNo, long contactNo) {
        this.name = name;
        this.regNo = regNo;
        this.contactNo = contactNo;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Reg No: " + regNo);
        System.out.println("Contact: " + contactNo);
    }
}

class Management {
    Student student;

    Management(Student student) {
        this.student = student;
    }

    void showStudent() {
        student.display();
    }
}

class sms {
    public static void main(String[] args) {
        Student s1 = new Student("pradeep", "2024bit057", 496846465l);
        Management mgmt = new Management(s1);
        mgmt.showStudent();
    }
}
