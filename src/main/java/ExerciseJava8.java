import bean.SampleBean;
import bean.SampleBeanChild;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ExerciseJava8 {
    /**
     * 目安20分<BR>
     * 1. Consumerインタフェースを確認する<BR>
     * 2. 無名内部クラスにてConsumer型の変数を宣言する<BR>
     * (処理はSystem.out.println())<BR>
     * 3. 2.の変数をConsumer#accept()で実行する<BR>
     * 4. ラムダ式にてConsumer型の変数を宣言し、実行する<BR>
     *
     * @see Consumer
     */
    public void exercise1() {
    }

    /**
     * 目安20分<BR>
     * 1. 2つの引数を受け取り、int型を返却する変数をラムダ式で宣言し、実行する<BR>
     * (変数の型はjava.util.functionパッケージにあるインタフェースから探す、または自分でインタフェースを作る)<BR>
     */
    public void exercise2() {
    }

    /**
     * 目安20分<BR>
     * 1. list変数の、SampleBeanのidを全てSystem.out.println()する<BR>
     * (List#forEach()を使用する)<BR>
     * 2. list変数から、Stream<SampleBean>型の変数を作成する<BR>
     * (List#stream()を使用する)<BR>
     * 3. 2.の変数から、SampleBeanのidが2以外のbeanを対象として、nameをSystem.out.println()する<BR>
     * (Stream#filter(),Stream#forEach()を使用する)<BR>
     */
    public void exercise3() {
        List<SampleBean> list = getSampleBeanList();
    }

    /**
     * 目安25分<BR>
     * 1. list変数から、Stream<SampleBeanChild>型の変数を作成する<BR>
     * (Stream#flatMap()を使用する。<BR>
     * flatMap()でSampleBeanのlistが持つ全てのSampleBeanChildを取得できる)<BR>
     * 2. 1.の変数を使用し、childNameを重複させずにSystem.out.println()する<BR>
     * (Stream#map()でStream<String>を作成した後、Stream#distinct()を使用する)<BR>
     */
    public void exercise4() {
        List<SampleBean> list = getSampleBeanList();
    }

    /**
     * 目安15分<BR>
     * 1. Consumer<String>型の変数を作成する<BR>
     * (引数を大文字に変換し、System.out.println()する)<BR>
     * 2. Optional<String>型の変数を "nullではない" で作成し、1.の変数をOptional#ifPresent()で実行する<BR>
     * 3. Optional<String>型の変数を null で作成し、1.の変数をOptional#ifPresent()で実行する<BR>
     * (ifPresent()はnullでなければ実行する処理のため、エラーが出ないことを確認する)<BR>
     */
    public void exercise5() {
    }

    /**
     * 目安10分<BR>
     * 1. ラムダ式内で外部の変数を再代入し、コンパイルエラーになることを確認する<BR>
     */
    public void exercise6() {
    }

    /**
     *
     */
    private List<SampleBean> getSampleBeanList() {
        List<SampleBean> ret = new ArrayList<>();
        for (int beanIdx = 1; beanIdx <= 3; beanIdx++) {
            SampleBean bean = new SampleBean();
            bean.setId(beanIdx);
            bean.setName("bean" + beanIdx);
            List<SampleBeanChild> beanChildList = new ArrayList<>();
            for (int childIdx = 1; childIdx <= 2; childIdx++) {
                SampleBeanChild child = new SampleBeanChild();
                child.setChildId(childIdx);
                child.setChildName("child" + childIdx);
                beanChildList.add(child);
            }
            bean.setSampleBeanChildList(beanChildList);
            ret.add(bean);
        }
        return ret;
    }
}
