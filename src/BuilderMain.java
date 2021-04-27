public class BuilderMain {
    public static void main(String[] args){
        Student estudiante = new Student.StudentBuilder()
                .setName("Jose Maria Saavedra Montecinos")
                .setAge(20)
                .setCareer("Ing.Sistemas")
                .setAddress("Circunvalacion y Beijing", "Cochabamba", "404")
                .addContact("Carolina Montecinos", "72846558",
                        "591", "Circunvalacion y Beijing", "Cochabamba", "404")
                .addContact("Jose Saavedra", "78965445", "591",
                        "Calle Montero", "Santa Cruz", "1895")
                .addPhone("65894357", "591")
                .addPhone("4895257", "591")
                .build();
        System.out.println(estudiante.toString());
    }
}

