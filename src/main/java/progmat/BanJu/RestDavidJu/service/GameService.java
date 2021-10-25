package progmat.BanJu.RestDavidJu.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Service;

@Getter
@Service
@AllArgsConstructor
public class GameService {

    public String getTextWithNumber(boolean isForUser, int number) {
        if (isForUser) {
            return "Number of removed hair: " + number + "\r\n";
        }
        return "Remaining hair: " + number + "\r\n";
    }

    public String getWinnerMsg(int userNum, int progNum) {
        if (userNum > progNum) {
            return "You won, David is almost hairless!";
        } else if (userNum < progNum) {
            return "Continue waxing!";
        }
        return "Half is still left!!";
    }

    public int random(int min, int max) {
        return (int) (Math.random() * max + min);
    }

}
