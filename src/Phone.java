public class Phone {
    private String phoneNumer;
    private String ext;

    @Override
    public String toString() {
        return "Phone{" +
                "phoneNumer='" + phoneNumer + '\'' +
                ", ext='" + ext + '\'' +
                '}';
    }

    public Phone(String phoneNumer, String ext) {
        this.phoneNumer = phoneNumer;
        this.ext = ext;
    }

    public String getPhoneNumer() {
        return phoneNumer;
    }

    public void setPhoneNumer(String phoneNumer) {
        this.phoneNumer = phoneNumer;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }
}
