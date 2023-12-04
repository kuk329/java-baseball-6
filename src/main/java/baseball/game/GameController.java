package baseball.game;

import baseball.game.view.InputView;
import baseball.game.view.OutputView;

public class GameController {

    private final OutputView outputView = new OutputView();
    private final InputView inputView = new InputView();

    private final GameService gameService = new GameService();
    private boolean restartFlag = false;


    public void start() {
        outputView.startMessage(); // 출력 메세지
        initGameInfo(); // 게임 진행을 위한 정보 초기화
    }

    public void initGameInfo() {
        ComputerNumber computer = new ComputerNumber(); // 컴퓨터 객체 생성
        User user = new User(); // 사용자 객체 생성
        do {
            String input = inputView.inputNumbers();// 사용자 한테 값을 입력받음.
            user.setUserNumbers(input);
            restartFlag = gameService.compareNumberBetweenUserAndComputer(user.getNumbers(),
                    computer.getComputerNum()); // 값 비교를 통해서 값이 일치하면 종료 아니면 다시 실행.
        } while (!restartFlag);

        restart();
    }

    public void restart() { // 재시작 여부 확인
        String input = inputView.restartMessage();
        int restartNumber = Integer.parseInt(input);
        validateRestartNumber(restartNumber); // 입력값에 대한 예외 처리
        if (restartNumber == 1) {
            initGameInfo();
        }
    }

    // todo
    // 1. Computer 클래스 객체 변수명 함수명 수정
    // 2. GameService에 대한 메서드 구현
//    public boolean compareNumber(List<Integer> userNum, List<Integer> computerNum) { // 컴퓨터 번호와 사용자가 입력한 번호 비교
//        //  1: 컴퓨터 숫자배열에 사용자가 입력한 수가 몇개나 들어있는지를 확인
//        int ball = 0;
//        int strike = 0;
//        int diff = 0;
//
//        for (int i = 0; i < 3; i++) {
//            if (computerNum.contains(userNum[i])) {
//                ball += 1;
//            }
//        }
//
//        //  2 : 위치도 일치하는지 확인
//        for (int i = 0; i < 3; i++) {
//            if (computerNum.get(i) == userNum[i]) {
//                strike += 1;
//            }
//        }
//        diff = ball - strike;
//        // strike 가 있으면 무조건 ball 도 존재
//        // ball 이 있어도 strike 는 0 일수 있음.
//
//        if (ball == 0 && strike == 0) { // 하나도 못맞춤
//            System.out.println("낫싱");
//
//        } else if (ball > 0 && strike == 0) { // 숫자만 맞춤
//            System.out.println(ball + "볼");
//
//        } else if (diff > 0) { // 맞춘게 있다는 뜻.
//            System.out.println(diff + "볼 " + strike + "스트라이크");
//        } else {
//            System.out.println(strike + "스트라이크");
//        }
//
//        if (strike == 3) {
//            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
//            return true;
//        }
//
//        return false; // 다시
//
//    }


    private void validateRestartNumber(int i) {
        if (!(i == 1 || i == 2)) {
            throw new IllegalArgumentException("1또는 2만 입력할 수 있습니다.");
        }
    }

}
