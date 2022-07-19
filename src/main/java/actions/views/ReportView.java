package actions.views;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 日報情報について画面の入力値・出力値を扱うViewモデル
 *
 */
@Getter //全てのクラスフィールドについてgetterを自動生成する(Lombok)
@Setter //全てのクラスフィールドについてsetterを自動生成する(Lombok)
@NoArgsConstructor //引数なしコンストラクタを自動生成する(Lombok)
@AllArgsConstructor //全てのクラスフィールドを引数にもつ引数ありコンストラクタを自動生成する(Lombok)
public class ReportView {

    /**
     * id
     */
    private Integer id;

    /**
     * シフトを登録した従業員
     */
    private EmployeeView employee;

    /**
     * いつの日付
     */
    private LocalDate reportDate;

    /**
     * 仕事場所（出勤：0、在宅：1、休み：2）
     */
    private Integer place;

    /**
     * 勤務開始時間
     */
    private Integer start_time;

    /**
     * 勤務終了時間
     */
    private Integer ending_time;
}