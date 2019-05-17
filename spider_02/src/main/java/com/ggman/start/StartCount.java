package com.ggman.start;


import com.ggman.entity.Page;
import com.ggman.service.DownLoadService;
import com.ggman.service.ProccessService;
import com.ggman.service.lmpl.HttpcilentDownLoadService;
import com.ggman.service.lmpl.YOUKUproccess;

/**
 * 执行入口
 */
public class StartCount {

    private DownLoadService downLoadService;    //下载接口
    private ProccessService proccessService;    //解析接口


    public static void main(String[] args) {
        String url = "https://v.youku.com/v_show/id_XNDE2NzAxMDYyMA==.html?spm=a2ha1.12528442.m_4424_c_11054_1.d_6&s=efbfbd0e4e53efbfbdef&scm=20140719.rcmd.4424.show_efbfbd0e4e53efbfbdef";
        StartCount startCount = new StartCount();
        startCount.setDownLoadService(new HttpcilentDownLoadService());     //传入到页面下载实现
        startCount.setProccessService(new YOUKUproccess());                 //传入到页面解析
        //下载页面
        Page page = startCount.downloadPage(url);
        //解析
        startCount.proccessPage(page);
        String content = page.getContent();                 //内容
      /*  System.out.println(content);*/
    }

    /**
     * 下载
     * @param url
     * @return
     */

    public Page downloadPage(String url){
        return  this.downLoadService.downLoadService(url);

    }

    /**
     * 页面解析
     * @param page
     */
    public  void proccessPage(Page page){
        this.proccessService.proccess(page);
    }

    public DownLoadService getDownLoadService() {
        return downLoadService;
    }

    public void setDownLoadService(DownLoadService downLoadService) {
        this.downLoadService = downLoadService;
    }


    public ProccessService getProccessService() {
        return proccessService;
    }

    public void setProccessService(ProccessService proccessService) {
        this.proccessService = proccessService;
    }
}
