package com.xst.controller;

import com.xst.bean.CateBean;
import com.xst.dao.CategoryDao;
import com.xst.entity.V9Resources;
import com.xst.util.MultipartFileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by sl on 16-4-4.
 */
@Controller
//@RequestMapping("/add")
public class AddResourcesController {

    @Autowired
    @Qualifier("categoryDao")
    private CategoryDao categoryDao;


    /**
     * 添加课程，GET
     * @param model
     * @return 一级目录
     */
    @ResponseBody
    @RequestMapping(value = "/addresource" , method = RequestMethod.GET)
    public String addResource(Model model){

        List<CateBean> fisrtCategorys = categoryDao.getFirstCategory();

        model.addAttribute("firstCategorys",fisrtCategorys);

        return  "/addresource";
    }


    @ResponseBody
    @RequestMapping(value = "/addresource" , method = RequestMethod.POST)
    public String addResource(String title , int category1 , int category2 , int category3 ,
                              MultipartFile video , RedirectAttributes redirectAttributes ,
                              HttpSession session){

        V9Resources resource = new V9Resources();

        resource.setTitle(title);
        resource.setCategory1Id(category1);
        resource.setCategory1(categoryDao.getById((short)category1).getCatname());

        resource.setCategory2Id(category2);
        resource.setCategory2(categoryDao.getById((short) category2).getCatname());

        resource.setCategory3Id(category3);
        resource.setCategory3(categoryDao.getById((short) category3).getCatname());


        if(!video.isEmpty()){

            String filePath = session.getAttribute("upfilepath").toString();
            String videoUrl = MultipartFileUtils.saveFile(video,filePath);

            resource.setUrl(videoUrl);
        }

        return "";
    }


}
