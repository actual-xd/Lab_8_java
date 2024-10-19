public class StringProcessor {
    String result(String str, Operation operation) {
        return operation.apply(str);
    }
}
