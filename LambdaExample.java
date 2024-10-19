public class LambdaExample {
    public static void main(String[] args){
        StringProcessor strPr1 = new StringProcessor();
        String test_string = " Hello, World! ";
        Operation capitalize = (str) -> str.toUpperCase();
        Operation lower = (str) -> str.toLowerCase();
        Operation clearSpaces = (str) -> str.strip();
        Operation reversed = (str) -> {
            StringBuffer buffer = new StringBuffer(str);
            buffer.reverse();
            return String.valueOf(buffer);
        };

        System.out.println(strPr1.result(test_string, capitalize));
        System.out.println(strPr1.result(test_string, lower));
        System.out.println(strPr1.result(test_string, clearSpaces));
        System.out.println(strPr1.result(test_string, reversed));

    }
}
