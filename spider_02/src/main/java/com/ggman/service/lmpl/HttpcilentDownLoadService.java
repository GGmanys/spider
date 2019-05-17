package com.ggman.service.lmpl;

import com.ggman.entity.Page;
import com.ggman.service.DownLoadService;
import com.ggman.until.PageDownLoadUntil;

/**
 * 页面下载实现
 */

public class HttpcilentDownLoadService implements DownLoadService {

    @Override
    public Page downLoadService(String url) {
        Page page = new Page();
        page.setContent(PageDownLoadUntil.getPageContent(url));
        return page;
    }
}
