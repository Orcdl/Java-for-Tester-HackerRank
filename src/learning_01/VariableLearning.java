package learning_01;

public class VariableLearning {
    public static void main(String[] args) {
        /*
        Complier và máy ảo Java sẽ thực thi
        Quá trình thực thi: máy tính ơi, cấp phát cho tui một vài vùng nhớ nào đó mà tui có thể chứa được cái chữ byte; chữ byte này sẽ cần bao nhiêu ô nhớ của vùng nhớ đó
        Lưu cho tui chỗ đó với cái tên là myBytenumber; máy ảo Java sẽ nhớ alias là myBytyeNumber. Để làm gì?
        Khi tui gọi myByteNumber thì ông trả lại cho tui giá trị vào trong ô nhớ đó; để tui tính toán
        Ý nghĩa dấu = : gán giá trị bên phải cho giá trị bên trái
         */
        //byte myByteNumber = 1;
        /*
        In mybytenumnber ra. Thằng mybytenumber đang có giá trị bao nhiêu? lấy ra cho tui đi.
        Máy tính: truy cập vào địa chỉ bộ nhớ đó, lấy giá trị ra; tính toán và gửi ra cho mình
         */
        byte myByteNumber = 1;
        System.out.println(myByteNumber);
        System.out.println(Byte.MAX_VALUE);

        /*
        Muốn biết loại dữ liệu này (byte) chứa con số lớn nhất là bao nhiêu
         */
//        Byte.MAX_VALUE
        /*
        Muốn in ra có hai cách:
        - sout đưa giá trị vào
        - . sout
         */

//   Sự khác biệt giữa print bình thường (print) và print new line (println) là newline sẽ xuống dòng
//  Vậy nếu để Byte.MAX_VALUE = 128 thì sao? -> Java báo lỗi (chén & quả mít)


        /*
        1 loại dữ liệu hay dùng trong ngân hàng - Big Number
        // 0.99
        // 0.9999999
        /*
        Floating và double là hai loại liên quan đến số thực. Liên quan đến dấu phẩy động. Bên sau có dấu phẩy động. Cái nào chứa càng nhiều còn số phẩy động phía sau thì con số đó càng chính xác
         */
    }
}
