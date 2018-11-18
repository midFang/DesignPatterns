package example.fangsf.desiginpatterns.template;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import example.fangsf.desiginpatterns.R;


/**
 * 模板设计模式, 通常开发中使用到的baseActivity就是一个模板设计模式
 * 定义: 定义一个操作中算法的框架,并且将一些操作的步骤延迟到子类当中,使得子类可以不修改算法的结构的既可以重新定义该算法的某些特定的步骤
 * 体现:
 * 1,比如BaseActivity 中通常都有是否设置title,那么可以延迟到子类中,进行title的设置,
 * 2,多个子类有共有的方法, 并且基本的逻辑都是相同的, 那么可以延伸到父类中
 * 3,重要的复杂的算法,可以把核心的算法设计为模板方法, 周边的相关的细节可以由各个子类进行实现,
 * 4,重构时,模板方法是经常使用的模式, 将相同的代码抽取到父类当中,然后通过钩子函数,约束其行为
 */
public class TemplateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_template);







    }


    /**
     * AsyncTask 其实也是一个模板设计模式, 具体的实现都通过子类去实现,
     * onPreExecute -> doInBackground -> onPostExecute
     * 这些执行方法都是一套顺序的流程,
     */
    class Async extends AsyncTask<Void,Integer,String>{

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected String doInBackground(Void... voids) {
            return null;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
        }
    }



}
