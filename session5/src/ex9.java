import java.util.Scanner;

public class ex9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap url: ");
        String url = sc.nextLine();

        String regex = "^(http|https)://([A-Za-z0-9.-]+)(/.*)?$";

        if(!url.matches(regex)) {
            System.out.print("url khong hop le");
            return;
        }

        // tach protocol
        int protocolEnd = url.indexOf("://");
        String protocol = url.substring(0,protocolEnd);

        // Phần còn lại sau protocol
        String remaining = url.substring(protocolEnd + 3);

        String domain;
        String path = "";

        int pathStart = remaining.indexOf("/");

        if(pathStart==-1){
            domain = remaining;
        }
        else {
            domain = remaining.substring(0,pathStart);
            path = remaining.substring(pathStart);
        }

        System.out.println("Protocol: " + protocol);
        System.out.println("Domain: " + domain);
        System.out.println("Path: " + path);
    }
}
