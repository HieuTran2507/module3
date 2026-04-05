public class ex5 {
    static void main(String[] args){
        int n = 100000; // tao so lan lap lon de thay ro su khac biet

        // STRING
        long start1 = System.currentTimeMillis();
        String s = "Hello";
        for(int i=0;i<n;i++){
            s = s + " World";
        }
        long end1 = System.currentTimeMillis();
        System.out.println("String time: "+(end1-start1)+" ms");

        // STRING BUILDER
        long start2 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("Hello");
        for (int i = 0; i < n; i++) {
            sb.append(" World");
        }

        long end2 = System.currentTimeMillis();
        System.out.println("StringBuilder time: " + (end2 - start2) + " ms");

        // STRING BUFFER
        long start3 = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer("Hello");
        for (int i = 0; i < n; i++) {
            sbf.append(" World");
        }
        long end3 = System.currentTimeMillis();
        System.out.println("StringBuffer time: " + (end3 - start3) + " ms");
    }
}
