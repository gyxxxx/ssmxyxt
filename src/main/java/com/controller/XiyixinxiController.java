package com.controller;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.entity.Xiyixinxi;
import com.server.XiyixinxiServer;
import com.util.PageBean;
@Controller
public class XiyixinxiController {
	@Resource
	private XiyixinxiServer xiyixinxiService;


   
	@RequestMapping("addXiyixinxi.do")
	public String addXiyixinxi(HttpServletRequest request,Xiyixinxi xiyixinxi,HttpSession session) throws SQLException{
		Timestamp time=new Timestamp(System.currentTimeMillis());
		
		xiyixinxi.setAddtime(time.toString().substring(0, 19));
		xiyixinxiService.add(xiyixinxi);
		
		session.setAttribute("backxx", "添加成功");
		session.setAttribute("backurl", request.getHeader("Referer"));
		
		//session.setAttribute("backurl", "xiyixinxiList.do");
		
		return "redirect:postback.jsp";
		//return "redirect:xiyixinxiList.do";
		
		
		
	}
 
//	处理编辑
	@RequestMapping("doUpdateXiyixinxi.do")
	public String doUpdateXiyixinxi(int id,ModelMap map,Xiyixinxi xiyixinxi){
		xiyixinxi=xiyixinxiService.getById(id);
		map.put("xiyixinxi", xiyixinxi);
		return "xiyixinxi_updt";
	}
	
	
	
	
	
//	后台详细
	@RequestMapping("xiyixinxiDetail.do")
	public String xiyixinxiDetail(int id,ModelMap map,Xiyixinxi xiyixinxi){
		xiyixinxi=xiyixinxiService.getById(id);
		map.put("xiyixinxi", xiyixinxi);
		return "xiyixinxi_detail";
	}
//	前台详细
	@RequestMapping("xyxxDetail.do")
	public String xyxxDetail(int id,ModelMap map,Xiyixinxi xiyixinxi){
		xiyixinxi=xiyixinxiService.getById(id);
		map.put("xiyixinxi", xiyixinxi);
		return "xiyixinxidetail";
	}
//	
	@RequestMapping("updateXiyixinxi.do")
	public String updateXiyixinxi(int id,ModelMap map,Xiyixinxi xiyixinxi,HttpServletRequest request,HttpSession session){
		xiyixinxiService.update(xiyixinxi);
		session.setAttribute("backxx", "修改成功");
		session.setAttribute("backurl", request.getHeader("Referer"));
		return "redirect:postback.jsp";
		//String url = request.getHeader("Referer");
		//return "redirect:"+url;
		//return "redirect:xiyixinxiList.do";
	}

//	分页查询
	@RequestMapping("xiyixinxiList.do")
	public String xiyixinxiList(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Xiyixinxi xiyixinxi, String bianhao, String xiyifangfa, String yifuleixing, String zhuyineirong, String jiage1,String jiage2, String beizhu){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);
		
		
		if(bianhao==null||bianhao.equals("")){pmap.put("bianhao", null);}else{pmap.put("bianhao", bianhao);}		if(xiyifangfa==null||xiyifangfa.equals("")){pmap.put("xiyifangfa", null);}else{pmap.put("xiyifangfa", xiyifangfa);}		if(yifuleixing==null||yifuleixing.equals("")){pmap.put("yifuleixing", null);}else{pmap.put("yifuleixing", yifuleixing);}		if(zhuyineirong==null||zhuyineirong.equals("")){pmap.put("zhuyineirong", null);}else{pmap.put("zhuyineirong", zhuyineirong);}		if(jiage1==null||jiage1.equals("")){pmap.put("jiage1", null);}else{pmap.put("jiage1", jiage1);}		if(jiage2==null||jiage2.equals("")){pmap.put("jiage2", null);}else{pmap.put("jiage2", jiage2);}		if(beizhu==null||beizhu.equals("")){pmap.put("beizhu", null);}else{pmap.put("beizhu", beizhu);}		
		int total=xiyixinxiService.getCount(pmap);
		pageBean.setTotal(total);
		List<Xiyixinxi> list=xiyixinxiService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "xiyixinxi_list";
	}
	
	@RequestMapping("xiyixinxi_yanben1.do")
	public String xiyixinxi_yanben1(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Xiyixinxi xiyixinxi, String bianhao, String xiyifangfa, String yifuleixing, String zhuyineirong, String jiage1,String jiage2, String beizhu){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);
		
		
		if(bianhao==null||bianhao.equals("")){pmap.put("bianhao", null);}else{pmap.put("bianhao", bianhao);}		if(xiyifangfa==null||xiyifangfa.equals("")){pmap.put("xiyifangfa", null);}else{pmap.put("xiyifangfa", xiyifangfa);}		if(yifuleixing==null||yifuleixing.equals("")){pmap.put("yifuleixing", null);}else{pmap.put("yifuleixing", yifuleixing);}		if(zhuyineirong==null||zhuyineirong.equals("")){pmap.put("zhuyineirong", null);}else{pmap.put("zhuyineirong", zhuyineirong);}		if(jiage1==null||jiage1.equals("")){pmap.put("jiage1", null);}else{pmap.put("jiage1", jiage1);}		if(jiage2==null||jiage2.equals("")){pmap.put("jiage2", null);}else{pmap.put("jiage2", jiage2);}		if(beizhu==null||beizhu.equals("")){pmap.put("beizhu", null);}else{pmap.put("beizhu", beizhu);}		
		int total=xiyixinxiService.getCount(pmap);
		pageBean.setTotal(total);
		List<Xiyixinxi> list=xiyixinxiService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "xiyixinxi_yanben1";
	}
	@RequestMapping("xiyixinxi_yanben2.do")
	public String xiyixinxi_yanben2(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Xiyixinxi xiyixinxi, String bianhao, String xiyifangfa, String yifuleixing, String zhuyineirong, String jiage1,String jiage2, String beizhu){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);
		
		
		if(bianhao==null||bianhao.equals("")){pmap.put("bianhao", null);}else{pmap.put("bianhao", bianhao);}		if(xiyifangfa==null||xiyifangfa.equals("")){pmap.put("xiyifangfa", null);}else{pmap.put("xiyifangfa", xiyifangfa);}		if(yifuleixing==null||yifuleixing.equals("")){pmap.put("yifuleixing", null);}else{pmap.put("yifuleixing", yifuleixing);}		if(zhuyineirong==null||zhuyineirong.equals("")){pmap.put("zhuyineirong", null);}else{pmap.put("zhuyineirong", zhuyineirong);}		if(jiage1==null||jiage1.equals("")){pmap.put("jiage1", null);}else{pmap.put("jiage1", jiage1);}		if(jiage2==null||jiage2.equals("")){pmap.put("jiage2", null);}else{pmap.put("jiage2", jiage2);}		if(beizhu==null||beizhu.equals("")){pmap.put("beizhu", null);}else{pmap.put("beizhu", beizhu);}		
		int total=xiyixinxiService.getCount(pmap);
		pageBean.setTotal(total);
		List<Xiyixinxi> list=xiyixinxiService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "xiyixinxi_yanben2";
	}
	@RequestMapping("xiyixinxi_yanben3.do")
	public String xiyixinxi_yanben3(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Xiyixinxi xiyixinxi, String bianhao, String xiyifangfa, String yifuleixing, String zhuyineirong, String jiage1,String jiage2, String beizhu){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);
		
		
		if(bianhao==null||bianhao.equals("")){pmap.put("bianhao", null);}else{pmap.put("bianhao", bianhao);}		if(xiyifangfa==null||xiyifangfa.equals("")){pmap.put("xiyifangfa", null);}else{pmap.put("xiyifangfa", xiyifangfa);}		if(yifuleixing==null||yifuleixing.equals("")){pmap.put("yifuleixing", null);}else{pmap.put("yifuleixing", yifuleixing);}		if(zhuyineirong==null||zhuyineirong.equals("")){pmap.put("zhuyineirong", null);}else{pmap.put("zhuyineirong", zhuyineirong);}		if(jiage1==null||jiage1.equals("")){pmap.put("jiage1", null);}else{pmap.put("jiage1", jiage1);}		if(jiage2==null||jiage2.equals("")){pmap.put("jiage2", null);}else{pmap.put("jiage2", jiage2);}		if(beizhu==null||beizhu.equals("")){pmap.put("beizhu", null);}else{pmap.put("beizhu", beizhu);}		
		int total=xiyixinxiService.getCount(pmap);
		pageBean.setTotal(total);
		List<Xiyixinxi> list=xiyixinxiService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "xiyixinxi_yanben3";
	}
	@RequestMapping("xiyixinxi_yanben4.do")
	public String xiyixinxi_yanben4(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Xiyixinxi xiyixinxi, String bianhao, String xiyifangfa, String yifuleixing, String zhuyineirong, String jiage1,String jiage2, String beizhu){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);
		
		
		if(bianhao==null||bianhao.equals("")){pmap.put("bianhao", null);}else{pmap.put("bianhao", bianhao);}		if(xiyifangfa==null||xiyifangfa.equals("")){pmap.put("xiyifangfa", null);}else{pmap.put("xiyifangfa", xiyifangfa);}		if(yifuleixing==null||yifuleixing.equals("")){pmap.put("yifuleixing", null);}else{pmap.put("yifuleixing", yifuleixing);}		if(zhuyineirong==null||zhuyineirong.equals("")){pmap.put("zhuyineirong", null);}else{pmap.put("zhuyineirong", zhuyineirong);}		if(jiage1==null||jiage1.equals("")){pmap.put("jiage1", null);}else{pmap.put("jiage1", jiage1);}		if(jiage2==null||jiage2.equals("")){pmap.put("jiage2", null);}else{pmap.put("jiage2", jiage2);}		if(beizhu==null||beizhu.equals("")){pmap.put("beizhu", null);}else{pmap.put("beizhu", beizhu);}		
		int total=xiyixinxiService.getCount(pmap);
		pageBean.setTotal(total);
		List<Xiyixinxi> list=xiyixinxiService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "xiyixinxi_yanben4";
	}
	@RequestMapping("xiyixinxi_yanben5.do")
	public String xiyixinxi_yanben5(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Xiyixinxi xiyixinxi, String bianhao, String xiyifangfa, String yifuleixing, String zhuyineirong, String jiage1,String jiage2, String beizhu){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);
		
		
		if(bianhao==null||bianhao.equals("")){pmap.put("bianhao", null);}else{pmap.put("bianhao", bianhao);}		if(xiyifangfa==null||xiyifangfa.equals("")){pmap.put("xiyifangfa", null);}else{pmap.put("xiyifangfa", xiyifangfa);}		if(yifuleixing==null||yifuleixing.equals("")){pmap.put("yifuleixing", null);}else{pmap.put("yifuleixing", yifuleixing);}		if(zhuyineirong==null||zhuyineirong.equals("")){pmap.put("zhuyineirong", null);}else{pmap.put("zhuyineirong", zhuyineirong);}		if(jiage1==null||jiage1.equals("")){pmap.put("jiage1", null);}else{pmap.put("jiage1", jiage1);}		if(jiage2==null||jiage2.equals("")){pmap.put("jiage2", null);}else{pmap.put("jiage2", jiage2);}		if(beizhu==null||beizhu.equals("")){pmap.put("beizhu", null);}else{pmap.put("beizhu", beizhu);}		
		int total=xiyixinxiService.getCount(pmap);
		pageBean.setTotal(total);
		List<Xiyixinxi> list=xiyixinxiService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "xiyixinxi_yanben5";
	}
	
	
	
	@RequestMapping("xyxxList.do")
	public String xyxxList(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Xiyixinxi xiyixinxi, String bianhao, String xiyifangfa, String yifuleixing, String zhuyineirong, String jiage1,String jiage2, String beizhu){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);
		
		
		if(bianhao==null||bianhao.equals("")){pmap.put("bianhao", null);}else{pmap.put("bianhao", bianhao);}		if(xiyifangfa==null||xiyifangfa.equals("")){pmap.put("xiyifangfa", null);}else{pmap.put("xiyifangfa", xiyifangfa);}		if(yifuleixing==null||yifuleixing.equals("")){pmap.put("yifuleixing", null);}else{pmap.put("yifuleixing", yifuleixing);}		if(zhuyineirong==null||zhuyineirong.equals("")){pmap.put("zhuyineirong", null);}else{pmap.put("zhuyineirong", zhuyineirong);}		if(jiage1==null||jiage1.equals("")){pmap.put("jiage1", null);}else{pmap.put("jiage1", jiage1);}		if(jiage2==null||jiage2.equals("")){pmap.put("jiage2", null);}else{pmap.put("jiage2", jiage2);}		if(beizhu==null||beizhu.equals("")){pmap.put("beizhu", null);}else{pmap.put("beizhu", beizhu);}		
		int total=xiyixinxiService.getCount(pmap);
		pageBean.setTotal(total);
		List<Xiyixinxi> list=xiyixinxiService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "xiyixinxilist";
	}
	@RequestMapping("xyxxListtp.do")
	public String xyxxListtp(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Xiyixinxi xiyixinxi, String bianhao, String xiyifangfa, String yifuleixing, String zhuyineirong, String jiage1,String jiage2, String beizhu){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);
		
		
		if(bianhao==null||bianhao.equals("")){pmap.put("bianhao", null);}else{pmap.put("bianhao", bianhao);}		if(xiyifangfa==null||xiyifangfa.equals("")){pmap.put("xiyifangfa", null);}else{pmap.put("xiyifangfa", xiyifangfa);}		if(yifuleixing==null||yifuleixing.equals("")){pmap.put("yifuleixing", null);}else{pmap.put("yifuleixing", yifuleixing);}		if(zhuyineirong==null||zhuyineirong.equals("")){pmap.put("zhuyineirong", null);}else{pmap.put("zhuyineirong", zhuyineirong);}		if(jiage1==null||jiage1.equals("")){pmap.put("jiage1", null);}else{pmap.put("jiage1", jiage1);}		if(jiage2==null||jiage2.equals("")){pmap.put("jiage2", null);}else{pmap.put("jiage2", jiage2);}		if(beizhu==null||beizhu.equals("")){pmap.put("beizhu", null);}else{pmap.put("beizhu", beizhu);}		
		int total=xiyixinxiService.getCount(pmap);
		pageBean.setTotal(total);
		List<Xiyixinxi> list=xiyixinxiService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "xiyixinxilisttp";
	}
	
	@RequestMapping("deleteXiyixinxi.do")
	public String deleteXiyixinxi(int id,HttpServletRequest request){
		xiyixinxiService.delete(id);
		String url = request.getHeader("Referer");
		return "redirect:"+url;
		//return "redirect:xiyixinxiList.do";
	}
	
	
}
