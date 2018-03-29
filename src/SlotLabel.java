
import javafx.animation.KeyFrame;
        import javafx.animation.Timeline;
        import javafx.geometry.Pos;
        import javafx.scene.control.Label;
        import javafx.scene.layout.*;
        import javafx.scene.paint.Color;
        import javafx.util.Duration;


import java.util.ArrayList;
import java.util.Random;

public class SlotLabel extends Label {
    // アニメーションを行うためのTimeLineオブジェクト
    private Timeline timer;
    // スロットが回っている状態かを管理するフィールド
    private boolean isSlotStarted;

    SlotLabel(String text){
        super(text);
        isSlotStarted = false;

        //この下にthis.~という形で数字の見た目・揃える位置を記載しましょう

    }

    public void setSlotStarted(){
        // この中に各数字のスロットが回り始めた時の処理を記載しましょう
        String[] name_array = {"1","2","3","4","5","6","7","8","9"};
        ArrayList<SlotMachine> label_array= new ArrayList<>();
        Random rand = new Random();
        Timeline timer = new Timeline(new KeyFrame(Duration.millis(100), e ->{
//                0～配列の大きさの乱数を生成 100が0.1秒で決定される
            int randomNumber = rand.nextInt(name_array.length);
//                name_arrayから乱数をもとに配列を値を取得　name_array[0]は0番目の数を取得

//            for (int i =0; i<3 ; i++){
//                label_array.get(i).setText(name_array[randomNumber]);
            this.setText(String.valueOf(randomNumber));
//            }
        }));
        timer.setCycleCount(Timeline.INDEFINITE);
//            30回表示させる

        timer.play();
    }

    public void stopSlot() {
        // この中に各数字のスロットが止まった時の処理を記載しましょう
    }

}
