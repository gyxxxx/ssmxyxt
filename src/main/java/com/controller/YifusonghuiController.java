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

import com.entity.Yifusonghui;
import com.server.YifusonghuiServer;
import com.util.PageBean;
@Controller
public class YifusonghuiController {
	@Resource
	private YifusonghuiServer yifusonghuiService;


   
	@RequestMapping("addYifusonghui.do")
	public String addYifusonghui(HttpServletRequest request,Yifusonghui yifusonghui,HttpSession session) throws SQLException{
		Timestamp time=new Timestamp(System.currentTimeMillis());
		
		yifusonghui.setAddtime(time.toString().substring(0, 19));
		yifusonghuiService.add(yifusonghui);
		
		session.setAttribute("backxx", "添加成功");
		session.setAttribute("backurl", request.getHeader("Referer"));
		
		//session.setAttribute("backurl", "yifusonghuiList.do");
		
		return "redirect:postback.jsp";
		//return "redirect:yifusonghuiList.do";
		
		
		
	}
 
//	处理编辑
	@RequestMapping("doUpdateYifusonghui.do")
	public String doUpdateYifusonghui(int id,ModelMap map,Yifusonghui yifusonghui){
		yifusonghui=yifusonghuiService.getById(id);
		map.put("yifusonghui", yifusonghui);
		return "yifusonghui_updt";
	}
	
	
	
	
	
//	后台详细
	@RequestMapping("yifusonghuiDetail.do")
	public String yifusonghuiDetail(int id,ModelMap map,Yifusonghui yifusonghui){
		yifusonghui=yifusonghuiService.getById(id);
		map.put("yifusonghui", yifusonghui);
		return "yifusonghui_detail";
	}
//	前台详细
	@RequestMapping("yfshDetail.do")
	public String yfshDetail(int id,ModelMap map,Yifusonghui yifusonghui){
		yifusonghui=yifusonghuiService.getById(id);
		map.put("yifusonghui", yifusonghui);
		return "yifusonghuidetail";
	}
//	
	@RequestMapping("updateYifusonghui.do")
	public String updateYifusonghui(int id,ModelMap map,Yifusonghui yifusonghui,HttpServletRequest request,HttpSession session){
		yifusonghuiService.update(yifusonghui);
		session.setAttribute("backxx", "修改成功");
		session.setAttribute("backurl", request.getHeader("Referer"));
		return "redirect:postback.jsp";
		//String url = request.getHeader("Referer");
		//return "redirect:"+url;
		//return "redirect:yifusonghuiList.do";
	}

//	分页查询
	@RequestMapping("yifusonghuiList.do")
	public String yifusonghuiList(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Yifusonghui yifusonghui, String bianhao, String xiyifangfa, String yifuleixing, String jiage, String huoguibianhao, String xiadanren){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);
		
		
		if(bianhao==null||bianhao.equals("")){pmap.put("bianhao", null);}else{pmap.put("bianhao", bianhao);}		if(xiyifangfa==null||xiyifangfa.equals("")){pmap.put("xiyifangfa", null);}else{pmap.put("xiyifangfa", xiyifangfa);}		if(yifuleixing==null||yifuleixing.equals("")){pmap.put("yifuleixing", null);}else{pmap.put("yifuleixing", yifuleixing);}		if(jiage==null||jiage.equals("")){pmap.put("jiage", null);}else{pmap.put("jiage", jiage);}		if(huoguibianhao==null||huoguibianhao.equals("")){pmap.put("huoguibianhao", null);}else{pmap.put("huoguibianhao", huoguibianhao);}		if(xiadanren==null||xiadanren.equals("")){pmap.put("xiadanren", null);}else{pmap.put("xiadanren", xiadanren);}		
		int total=yifusonghuiService.getCount(pmap);
		pageBean.setTotal(total);
		List<Yifusonghui> list=yifusonghuiService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "yifusonghui_list";
	}
	
	@RequestMapping("yifusonghui_yanben1.do")
	public String yifusonghui_yanben1(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Yifusonghui yifusonghui, String bianhao, String xiyifangfa, String yifuleixing, String jiage, String huoguibianhao, String xiadanren){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);
		
		
		if(bianhao==null||bianhao.equals("")){pmap.put("bianhao", null);}else{pmap.put("bianhao", bianhao);}		if(xiyifangfa==null||xiyifangfa.equals("")){pmap.put("xiyifangfa", null);}else{pmap.put("xiyifangfa", xiyifangfa);}		if(yifuleixing==null||yifuleixing.equals("")){pmap.put("yifuleixing", null);}else{pmap.put("yifuleixing", yifuleixing);}		if(jiage==null||jiage.equals("")){pmap.put("jiage", null);}else{pmap.put("jiage", jiage);}		if(huoguibianhao==null||huoguibianhao.equals("")){pmap.put("huoguibianhao", null);}else{pmap.put("huoguibianhao", huoguibianhao);}		if(xiadanren==null||xiadanren.equals("")){pmap.put("xiadanren", null);}else{pmap.put("xiadanren", xiadanren);}		
		int total=yifusonghuiService.getCount(pmap);
		pageBean.setTotal(total);
		List<Yifusonghui> list=yifusonghuiService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "yifusonghui_yanben1";
	}
	@RequestMapping("yifusonghui_yanben2.do")
	public String yifusonghui_yanben2(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Yifusonghui yifusonghui, String bianhao, String xiyifangfa, String yifuleixing, String jiage, String huoguibianhao, String xiadanren){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);
		
		
		if(bianhao==null||bianhao.equals("")){pmap.put("bianhao", null);}else{pmap.put("bianhao", bianhao);}		if(xiyifangfa==null||xiyifangfa.equals("")){pmap.put("xiyifangfa", null);}else{pmap.put("xiyifangfa", xiyifangfa);}		if(yifuleixing==null||yifuleixing.equals("")){pmap.put("yifuleixing", null);}else{pmap.put("yifuleixing", yifuleixing);}		if(jiage==null||jiage.equals("")){pmap.put("jiage", null);}else{pmap.put("jiage", jiage);}		if(huoguibianhao==null||huoguibianhao.equals("")){pmap.put("huoguibianhao", null);}else{pmap.put("huoguibianhao", huoguibianhao);}		if(xiadanren==null||xiadanren.equals("")){pmap.put("xiadanren", null);}else{pmap.put("xiadanren", xiadanren);}		
		int total=yifusonghuiService.getCount(pmap);
		pageBean.setTotal(total);
		List<Yifusonghui> list=yifusonghuiService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "yifusonghui_yanben2";
	}
	@RequestMapping("yifusonghui_yanben3.do")
	public String yifusonghui_yanben3(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Yifusonghui yifusonghui, String bianhao, String xiyifangfa, String yifuleixing, String jiage, String huoguibianhao, String xiadanren){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);
		
		
		if(bianhao==null||bianhao.equals("")){pmap.put("bianhao", null);}else{pmap.put("bianhao", bianhao);}		if(xiyifangfa==null||xiyifangfa.equals("")){pmap.put("xiyifangfa", null);}else{pmap.put("xiyifangfa", xiyifangfa);}		if(yifuleixing==null||yifuleixing.equals("")){pmap.put("yifuleixing", null);}else{pmap.put("yifuleixing", yifuleixing);}		if(jiage==null||jiage.equals("")){pmap.put("jiage", null);}else{pmap.put("jiage", jiage);}		if(huoguibianhao==null||huoguibianhao.equals("")){pmap.put("huoguibianhao", null);}else{pmap.put("huoguibianhao", huoguibianhao);}		if(xiadanren==null||xiadanren.equals("")){pmap.put("xiadanren", null);}else{pmap.put("xiadanren", xiadanren);}		
		int total=yifusonghuiService.getCount(pmap);
		pageBean.setTotal(total);
		List<Yifusonghui> list=yifusonghuiService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "yifusonghui_yanben3";
	}
	@RequestMapping("yifusonghui_yanben4.do")
	public String yifusonghui_yanben4(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Yifusonghui yifusonghui, String bianhao, String xiyifangfa, String yifuleixing, String jiage, String huoguibianhao, String xiadanren){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);
		
		
		if(bianhao==null||bianhao.equals("")){pmap.put("bianhao", null);}else{pmap.put("bianhao", bianhao);}		if(xiyifangfa==null||xiyifangfa.equals("")){pmap.put("xiyifangfa", null);}else{pmap.put("xiyifangfa", xiyifangfa);}		if(yifuleixing==null||yifuleixing.equals("")){pmap.put("yifuleixing", null);}else{pmap.put("yifuleixing", yifuleixing);}		if(jiage==null||jiage.equals("")){pmap.put("jiage", null);}else{pmap.put("jiage", jiage);}		if(huoguibianhao==null||huoguibianhao.equals("")){pmap.put("huoguibianhao", null);}else{pmap.put("huoguibianhao", huoguibianhao);}		if(xiadanren==null||xiadanren.equals("")){pmap.put("xiadanren", null);}else{pmap.put("xiadanren", xiadanren);}		
		int total=yifusonghuiService.getCount(pmap);
		pageBean.setTotal(total);
		List<Yifusonghui> list=yifusonghuiService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "yifusonghui_yanben4";
	}
	@RequestMapping("yifusonghui_yanben5.do")
	public String yifusonghui_yanben5(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Yifusonghui yifusonghui, String bianhao, String xiyifangfa, String yifuleixing, String jiage, String huoguibianhao, String xiadanren){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);
		
		
		if(bianhao==null||bianhao.equals("")){pmap.put("bianhao", null);}else{pmap.put("bianhao", bianhao);}		if(xiyifangfa==null||xiyifangfa.equals("")){pmap.put("xiyifangfa", null);}else{pmap.put("xiyifangfa", xiyifangfa);}		if(yifuleixing==null||yifuleixing.equals("")){pmap.put("yifuleixing", null);}else{pmap.put("yifuleixing", yifuleixing);}		if(jiage==null||jiage.equals("")){pmap.put("jiage", null);}else{pmap.put("jiage", jiage);}		if(huoguibianhao==null||huoguibianhao.equals("")){pmap.put("huoguibianhao", null);}else{pmap.put("huoguibianhao", huoguibianhao);}		if(xiadanren==null||xiadanren.equals("")){pmap.put("xiadanren", null);}else{pmap.put("xiadanren", xiadanren);}		
		int total=yifusonghuiService.getCount(pmap);
		pageBean.setTotal(total);
		List<Yifusonghui> list=yifusonghuiService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "yifusonghui_yanben5";
	}
	
	@RequestMapping("yifusonghuiList2.do")
	public String yifusonghuiList2(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Yifusonghui yifusonghui, String bianhao, String xiyifangfa, String yifuleixing, String jiage, String huoguibianhao, String xiadanren,HttpServletRequest request){
		/*if(session.getAttribute("user")==null){
			return "login";
		}*/
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);
		
		pmap.put("xiadanren", (String)request.getSession().getAttribute("username"));
		if(bianhao==null||bianhao.equals("")){pmap.put("bianhao", null);}else{pmap.put("bianhao", bianhao);}		if(xiyifangfa==null||xiyifangfa.equals("")){pmap.put("xiyifangfa", null);}else{pmap.put("xiyifangfa", xiyifangfa);}		if(yifuleixing==null||yifuleixing.equals("")){pmap.put("yifuleixing", null);}else{pmap.put("yifuleixing", yifuleixing);}		if(jiage==null||jiage.equals("")){pmap.put("jiage", null);}else{pmap.put("jiage", jiage);}		if(huoguibianhao==null||huoguibianhao.equals("")){pmap.put("huoguibianhao", null);}else{pmap.put("huoguibianhao", huoguibianhao);}		
		
		int total=yifusonghuiService.getCount(pmap);
		pageBean.setTotal(total);
		List<Yifusonghui> list=yifusonghuiService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "yifusonghui_list2";
	}	
	
	@RequestMapping("yfshList.do")
	public String yfshList(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Yifusonghui yifusonghui, String bianhao, String xiyifangfa, String yifuleixing, String jiage, String huoguibianhao, String xiadanren){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);
		
		
		if(bianhao==null||bianhao.equals("")){pmap.put("bianhao", null);}else{pmap.put("bianhao", bianhao);}		if(xiyifangfa==null||xiyifangfa.equals("")){pmap.put("xiyifangfa", null);}else{pmap.put("xiyifangfa", xiyifangfa);}		if(yifuleixing==null||yifuleixing.equals("")){pmap.put("yifuleixing", null);}else{pmap.put("yifuleixing", yifuleixing);}		if(jiage==null||jiage.equals("")){pmap.put("jiage", null);}else{pmap.put("jiage", jiage);}		if(huoguibianhao==null||huoguibianhao.equals("")){pmap.put("huoguibianhao", null);}else{pmap.put("huoguibianhao", huoguibianhao);}		if(xiadanren==null||xiadanren.equals("")){pmap.put("xiadanren", null);}else{pmap.put("xiadanren", xiadanren);}		
		int total=yifusonghuiService.getCount(pmap);
		pageBean.setTotal(total);
		List<Yifusonghui> list=yifusonghuiService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "yifusonghuilist";
	}
	@RequestMapping("yfshListtp.do")
	public String yfshListtp(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Yifusonghui yifusonghui, String bianhao, String xiyifangfa, String yifuleixing, String jiage, String huoguibianhao, String xiadanren){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);
		
		
		if(bianhao==null||bianhao.equals("")){pmap.put("bianhao", null);}else{pmap.put("bianhao", bianhao);}		if(xiyifangfa==null||xiyifangfa.equals("")){pmap.put("xiyifangfa", null);}else{pmap.put("xiyifangfa", xiyifangfa);}		if(yifuleixing==null||yifuleixing.equals("")){pmap.put("yifuleixing", null);}else{pmap.put("yifuleixing", yifuleixing);}		if(jiage==null||jiage.equals("")){pmap.put("jiage", null);}else{pmap.put("jiage", jiage);}		if(huoguibianhao==null||huoguibianhao.equals("")){pmap.put("huoguibianhao", null);}else{pmap.put("huoguibianhao", huoguibianhao);}		if(xiadanren==null||xiadanren.equals("")){pmap.put("xiadanren", null);}else{pmap.put("xiadanren", xiadanren);}		
		int total=yifusonghuiService.getCount(pmap);
		pageBean.setTotal(total);
		List<Yifusonghui> list=yifusonghuiService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "yifusonghuilisttp";
	}
	
	@RequestMapping("deleteYifusonghui.do")
	public String deleteYifusonghui(int id,HttpServletRequest request){
		yifusonghuiService.delete(id);
		String url = request.getHeader("Referer");
		return "redirect:"+url;
		//return "redirect:yifusonghuiList.do";
	}
	
	
}
