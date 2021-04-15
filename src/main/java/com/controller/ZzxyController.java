package com.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.Xiyixinxi;
import com.entity.Zzxy;
import com.server.XiyixinxiServer;
import com.server.ZzxyServer;
import com.util.PageBean;
import com.util.JsonResult;




@Controller
public class ZzxyController {

	@Resource
	private ZzxyServer zzxyServer;
	@Resource
	private XiyixinxiServer xiyixinxiService;

	/**
	 * 查询洗衣机列表
	 */
	@RequestMapping("zzxy.do")
	public String xyxxList(@RequestParam(value = "page", required = false) String page, ModelMap map,
			HttpSession session, Zzxy zzxy, String bianhao, Integer sbzt) {
		if (page == null || page.equals("")) {
			page = "1";
		}
		PageBean pageBean = new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap = new HashMap<String, Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);

		if (bianhao == null || bianhao.equals("")) {
			pmap.put("bianhao", null);
		} else {
			pmap.put("bianhao", bianhao);
		}
		if (sbzt == null || sbzt.equals("")) {
			pmap.put("sbzt", null);
		} else {
			pmap.put("sbzt", sbzt);
		}
		/*
		 * if(yifuleixing==null||yifuleixing.equals("")){pmap.put("yifuleixing",
		 * null);}else{pmap.put("yifuleixing", yifuleixing);}
		 * if(zhuyineirong==null||zhuyineirong.equals("")){pmap.put(
		 * "zhuyineirong", null);}else{pmap.put("zhuyineirong", zhuyineirong);}
		 * if(jiage1==null||jiage1.equals("")){pmap.put("jiage1",
		 * null);}else{pmap.put("jiage1", jiage1);}
		 * if(jiage2==null||jiage2.equals("")){pmap.put("jiage2",
		 * null);}else{pmap.put("jiage2", jiage2);}
		 * if(beizhu==null||beizhu.equals("")){pmap.put("beizhu",
		 * null);}else{pmap.put("beizhu", beizhu);}
		 */

		// int total=xiyixinxiService.getCount(pmap);
		// pageBean.setTotal(total);
		List<Zzxy> list = zzxyServer.getAll(pmap);
		//System.out.println(list.get(0).toString());
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "zzxyList";
	}

	// 前台详细
	@RequestMapping("zzxyDetail.do")
	public String zzxyDetail(int id, ModelMap map, Zzxy zzxy) {
		PageBean pageBean = new PageBean(1, 15);
		Map<String, Object> pmap = new HashMap<String, Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);
		zzxy = zzxyServer.getById(id);
		List<Xiyixinxi> list = xiyixinxiService.getAll(null);
		map.put("zzxy", zzxy);
		map.put("xyxx", list);
		return "zzxydetail";
	}

	/**
	 * 洗衣详细信息查询
	 * 
	 * @param id
	 * @param map
	 * @param xiyixinxi
	 * @return
	 */
	@RequestMapping(value = "/xyxxxxDetail.do", produces={"application/json; charset=UTF-8"})
	@ResponseBody
	public JsonResult xyxxxxDetail(Integer id, ModelMap map, Xiyixinxi xiyixinxi) {
		JsonResult jr = new JsonResult();
		xiyixinxi = xiyixinxiService.getById(id);
		jr.setMessage("ok");
		jr.setData(xiyixinxi);
		return jr;
	}
}
