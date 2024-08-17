package casting;

public class Parent {
    private String name;
    private int age;
    private String nativePlace;
    private String workPlace;
    private String workDomain;

    public void work(){
        System.out.println("working in"+" "+workDomain);
    }
    private void speak(){
        System.out.println("parent will speak");
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

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public String getWorkDomain() {
        return workDomain;
    }

    public void setWorkDomain(String workDomain) {
        this.workDomain = workDomain;
    }
}
