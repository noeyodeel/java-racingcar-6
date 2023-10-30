package racingcar;

import java.util.ArrayList;
import java.util.List;
import camp.nextstep.edu.missionutils.Console;

public class CarName {

  private List<String> carNames;

  public CarName() {
    carNames = new ArrayList<>();
  }

  public List<String> getCarNames() {
    return carNames;
  }

  public void setCarNames(List<String> names) {
    carNames = names;
  }

  public void addCarName(String name) {
    carNames.add(name);
  }

  public void inputCarNames() {
    System.out.println("경주할 자동차 이름을 입력하세요. (이름은 쉼표(,)로 구분합니다)");
    String input = Console.readLine();
    List<String> names = splitAndTrimNames(input);
    exception_Length(names);
    carNames = names;
  }

  private List<String> splitAndTrimNames(String input) {
    String[] nameArray = input.split(",");
    List<String> names = new ArrayList<>();
    for (String name : nameArray) {
      names.add(name.trim());
    }
    return names;
  }

  private void exception_Length(List<String> names) {
    for (String name : names) {
      if (name.length() > 5) {
        throw new IllegalArgumentException("5자 이하로 입력하세요.");
      }
    }
  }
}
