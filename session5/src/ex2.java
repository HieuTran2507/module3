public class ex2 {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("hello, java world!");
        System.out.println("chuoi ban dau: "+sb);

        // xoa ky tu tu vi tri 5 - 9
        sb.delete(5,9);
        System.out.println("chuoi sau khi xoa: "+sb);

        // thay the world bang universe
        int start = sb.indexOf("world");
        if(start!=-1) sb.replace(start,start+5,"universe");
        System.out.print("chuoi sau khi thay the: "+sb);
    }
}
