package com.ggman.service.lmpl;

import com.ggman.entity.Page;
import com.ggman.service.ProccessService;
import org.htmlcleaner.HtmlCleaner;
import org.htmlcleaner.TagNode;
import org.htmlcleaner.XPatherException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 优酷解析
 */
public class YOUKUproccess  implements ProccessService {
    private String content;

    @Override
    public void proccess(Page page) {

        //根据获取到的数据设置正则表达式
        String allnumberPegex = "(?<=热度 )[\\d]+";
        String content = page.getContent();
        HtmlCleaner htmlClaner = new HtmlCleaner();
        TagNode rootNode = htmlClaner.clean(content);

        try {
            //获取到热度
            Object[] objects = rootNode.evaluateXPath("//*[@id=\"listitem_page1\"]/div/a/div[3]");
            if(objects.length>0){
                TagNode node = (TagNode) objects[0];    //获取到第一个
                Pattern pattern = Pattern.compile(allnumberPegex,Pattern.DOTALL);
                Matcher matcher = pattern.matcher(node.getText().toString());//规则来匹配结果
                if(matcher.find()){
                    System.out.println("总热度"+matcher.group(0));    //取第一个
                }


            }
        } catch (XPatherException e) {
            e.printStackTrace();
        }
    }
}
