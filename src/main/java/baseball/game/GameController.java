package baseball.game;

import baseball.game.domain.Computer;
import baseball.game.domain.User;
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
        Computer computer = new Computer(); // 컴퓨터 객체 생성
        User user = new User(); // 사용자 객체 생성
        do {
            String input = inputView.inputNumbers();// 사용자 한테 값을 입력받음.
            user.clearNumbers();
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


    private void validateRestartNumber(int i) {
        if (!(i == 1 || i == 2)) {
            throw new IllegalArgumentException("1또는 2만 입력할 수 있습니다.");
        }
    }

}
