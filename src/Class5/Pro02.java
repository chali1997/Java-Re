package Class5;

public class Pro02 {
    public static void main(String[] args) {
        //请取出文件地址“F:\张劲波\Java\05\作业.txt”中的文件名“作业”并输出
        String path = "F:\\张劲波\\Java\\05\\作业.txt";  //字符串对象
        int x = path.lastIndexOf('\\');  //最后一个、的位置
        int y = path.lastIndexOf('.');  //最后一个.的位置
        //获取斜杠\之后到.之前的字符串
        String filename = path.substring(x + 1, y);  //从x+1开始截取到y-1
        System.out.println("文件名为: " + filename);
    }
}
