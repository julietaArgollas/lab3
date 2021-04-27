import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class Student {
    private String name;
    private int age;
    private String career;
    private Address address;
    private List<Phone> phones;
    private List<Contact> contacsEmergency;

    public Student(String name, int age, String career, Address address, List<Phone> phones, List<Contact> contacsEmergency) {
        this.name = name;
        this.age = age;
        this.career = career;
        this.address = address;
        this.phones = phones;
        this.contacsEmergency = contacsEmergency;
    }

    public Student(){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    public List<Contact> getContacsEmergencys() {
        return contacsEmergency;
    }

    public void setContacsEmergency(List<Contact> subjects) {
        this.contacsEmergency = subjects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", career='" + career + '\'' +
                ", address=" + address +
                ", phones=" + phones.toString() +
                ", contacsEmergency=" + contacsEmergency.toString() +
                '}';
    }

    public static class StudentBuilder implements IBuilder<Student>{
        private String name;
        private int age;
        private String career;
        private Address address;
        private List<Phone> phones = new ArrayList<>();
        private List<Contact> contacsEmergency = new ArrayList<>();

        public StudentBuilder(){
        }

        public StudentBuilder setName(String name){
            this.name = name;
            return this;
        }

        public StudentBuilder setAge (int age){
            this.age = age;
            return this;
        }

        public StudentBuilder setCareer(String career){
            this.career = career;
            return this;
        }

        public StudentBuilder setAddress(String addres, String city, String number){
            address = new Address(addres,city, number);
            return this;
        }

        public StudentBuilder addPhone(String phoneNumber, String ext){
            phones.add(new Phone(phoneNumber, ext));
            return this;
        }

        public  StudentBuilder addContact(String name, String phoneNumber, String ext, String address, String city, String number){
            contacsEmergency.add(new Contact(name, new Phone(phoneNumber, ext), new Address(address, city, number)));
            return this;
        }

        public StudentBuilder addContacts(String name, String phoneNumber, String ext){
            contacsEmergency.add(new Contact(name, new Phone(phoneNumber, ext)));
            return this;
        }

        @Override
        public Student build(){
            return new Student(name, age, career, address, phones, contacsEmergency);
        }
    }

}

