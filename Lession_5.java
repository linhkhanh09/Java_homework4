package fs.apidef.identifyservice.java.class_4;

// in ra màn hình index của tất cả ký tự ‘o’ trong chuỗi trên
public class Lession_5 {
    public static void main(String args[]) {
        String str = "You only live once, but if you do it right, once is enough";
        String work = "o";
        System.out.println("Chuỗi ban đầu: " + str);
        for (int i = -1; (i = str.indexOf(work, i + 1)) != -1; i++) {
            System.out.println("Vị trí ký tự o trong chuỗi str là: " + i);
        }
        int count = 0;
        // duyệt từ đầu đến cuối chuỗi
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'o') {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của ký tự " + 'o' +
                " trong chuỗi là:" + count);
    }
}