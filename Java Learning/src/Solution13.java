    import java.lang.reflect.*;
    import java.util.*;

    class Student{
        private String name;
        private String id;
        private String email;

        public String getName() {
            return name;
        }
        public String getId() {
            return id;
        }
        public String getEmail() {
            return email;
        }
        public void setName(String name) {
            this.name = name;
        }
        public void setId(String id) {
            this.id = id;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public boolean ahqym() {
            return false;
        }
                public boolean jmopy() {
            return false;
        }
                public boolean iwhtf() {
            return false;
        }
                public boolean isqdf() {
            return false;
        }
                public boolean hluvb() {
            return false;
        }
                public boolean ghtlj() {
            return false;
        }
                public boolean fmyce() {
            return false;
        }
                public boolean elyed() {
            return false;
        }
                public boolean ehjdm() {
            return false;
        }
                public boolean dvvwq() {
            return false;
        }
                public boolean dnqvo() {
            return false;
        }
                public boolean dnpym() {
            return false;
        }
                public boolean cmkxa() {
            return false;
        }
                public boolean cfwyc() {
            return false;
        }
                public boolean bwkbd() {
            return false;
        }
                public boolean atcks() {
            return false;
        }
                public boolean anotherfunction() {
            return false;
        }
                public boolean amftc() {
            return false;
        }
                public boolean sumvl() {
            return false;
        }                public boolean rmjig() {
            return false;
        }                public boolean qthde() {
            return false;
        }                public boolean pvgyp() {
            return false;
        }                public boolean ptrup() {
            return false;
        }                public boolean pqfct() {
            return false;
        }                public boolean pnruo() {
            return false;
        }                public boolean plaob() {
            return false;
        }                public boolean piwro() {
            return false;
        }                public boolean ormim() {
            return false;
        }                public boolean ogvdl() {
            return false;
        }                public boolean odyqp() {
            return false;
        }                public boolean nixhb() {
            return false;
        }                public boolean moebl() {
            return false;
        }                public boolean migyc() {
            return false;
        }                public boolean mcgme() {
            return false;
        }                public boolean levtp() {
            return false;
        }                public boolean khuag() {
            return false;
        }                public boolean kgwku() {
            return false;
        }                public boolean kbjlt() {
            return false;
        }                public boolean jnskt() {
            return false;
        }
        public boolean whjtj() {
            return false;
        }
        public boolean viyog() {
            return false;
        }
        public boolean viwuu() {
            return false;
        }
        public boolean vhxoi() {
            return false;
        }
        public boolean ujxei() {
            return false;
        }
        public boolean uccfq() {
            return false;
        }
        public boolean twyfa() {
            return false;
        }
        public boolean toxdp() {
            return false;
        }
        public boolean tntpj() {
            return false;
        }
        public boolean tkbpp() {
            return false;
        }
        public boolean ytijy() {
            return false;
        }
    }

    public class Solution13 {

        public static void main(String[] args){
            Class<?> student = new Student().getClass();
            Method[] methods = student.getDeclaredMethods();
            ArrayList<String> methodList = new ArrayList<>();

            for(Method method : methods) {
                if (!method.isSynthetic()) {
                    methodList.add(method.getName());
                }
            }
            Collections.sort(methodList);
            for(String name: methodList){
                System.out.println(name);
            }
        }
    }
