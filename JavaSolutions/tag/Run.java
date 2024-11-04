package tag;

public class Run {
    public static void main(String[] args) {
        Sol sol = new Sol();
        System.out.println(sol.checkTags("<div><b><p>hello</p></b></div>")); // Expected output: "true"
        System.out.println(sol.checkTags("<div><i>hello<p></a>"));          // Expected output: "div"
        System.out.println(sol.checkTags("</div><p></p><div>"));
    }
}
