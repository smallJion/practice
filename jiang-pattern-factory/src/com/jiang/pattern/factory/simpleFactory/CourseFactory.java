package com.jiang.pattern.factory.simpleFactory;

import static java.lang.Thread.sleep;

/**
 * 课程工厂
 *
 * @author Jion
 * @created 2019-03-07
 */
public class CourseFactory {

    public static void main(String[] args) {
      /*  for(;;){
            for(int i = 0;i<920000000;i++){
                try {
                    sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }*/
        while (true){
            try {
                sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
