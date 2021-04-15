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

import com.entity.Gouwuche;
import com.server.GouwucheServer;
import com.util.PageBean;
@Controller
public class GouwucheController {
	@Resource
	private GouwucheServer gouwucheService;


   
	@RequestMapping("addGouwuche.do")
	public String addGouwuche(HttpServletRequest request,Gouwuche gouwuche,HttpSession session) throws SQLException{
		Timestamp time=new Timestamp(System.currentTimeMillis());
		
		gouwuche.setAddtime(time.toString().substring(0, 19));
		gouwucheService.add(gouwuche);
		
		session.setAttribute("backxx", "添加成功");
		session.setAttribute("backurl", request.getHeader("Referer"));
		
		//session.setAttribute("backurl", "gouwucheList.do");
		
		return "redirect:postback.jsp";
		//return "redirect:gouwucheList.do";
		
		
		
	}
 
//	处理编辑
	@RequestMapping("doUpdateGouwuche.do")
	public String doUpdateGouwuche(int id,ModelMap map,Gouwuche gouwuche){
		gouwuche=gouwucheService.getById(id);
		map.put("gouwuche", gouwuche);
		return "gouwuche_updt";
	}
	
	
	
	
	
//	后台详细
	@RequestMapping("gouwucheDetail.do")
	public String gouwucheDetail(int id,ModelMap map,Gouwuche gouwuche){
		gouwuche=gouwucheService.getById(id);
		map.put("gouwuche", gouwuche);
		return "gouwuche_detail";
	}
//	前台详细
	@RequestMapping("gwcDetail.do")
	public String gwcDetail(int id,ModelMap map,Gouwuche gouwuche){
		gouwuche=gouwucheService.getById(id);
		map.put("gouwuche", gouwuche);
		return "gouwuchedetail";
	}
//	
	@RequestMapping("updateGouwuche.do")
	public String updateGouwuche(int id,ModelMap map,Gouwuche gouwuche,HttpServletRequest request,HttpSession session){
		gouwucheService.update(gouwuche);
		session.setAttribute("backxx", "修改成功");
		session.setAttribute("backurl", request.getHeader("Referer"));
		return "redirect:postback.jsp";
		//String url = request.getHeader("Referer");
		//return "redirect:"+url;
		//return "redirect:gouwucheList.do";
	}

//	分页查询
	@RequestMapping("gouwucheList.do")
	public String gouwucheList(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Gouwuche gouwuche, String bianhao, String xiyifangfa, String yifuleixing, String zhuyineirong, String jiage, String xiadanren){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);
		
		
		if(bianhao==null||bianhao.equals("")){pmap.put("bianhao", null);}else{pmap.put("bianhao", bianhao);}
		if(xiyifangfa==null||xiyifangfa.equals("")){pmap.put("xiyifangfa", null);}else{pmap.put("xiyifangfa", xiyifangfa);}
		if(yifuleixing==null||yifuleixing.equals("")){pmap.put("yifuleixing", null);}else{pmap.put("yifuleixing", yifuleixing);}
		if(zhuyineirong==null||zhuyineirong.equals("")){pmap.put("zhuyineirong", null);}else{pmap.put("zhuyineirong", zhuyineirong);}
		if(jiage==null||jiage.equals("")){pmap.put("jiage", null);}else{pmap.put("jiage", jiage);}
		if(xiadanren==null||xiadanren.equals("")){pmap.put("xiadanren", null);}else{pmap.put("xiadanren", xiadanren);}
		
		int total=gouwucheService.getCount(pmap);
		pageBean.setTotal(total);
		List<Gouwuche> list=gouwucheService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "gouwuche_list";
	}
	
	@RequestMapping("gouwuche_yanben1.do")
	public String gouwuche_yanben1(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Gouwuche gouwuche, String bianhao, String xiyifangfa, String yifuleixing, String zhuyineirong, String jiage, String xiadanren){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);
		
		
		if(bianhao==null||bianhao.equals("")){pmap.put("bianhao", null);}else{pmap.put("bianhao", bianhao);}
		if(xiyifangfa==null||xiyifangfa.equals("")){pmap.put("xiyifangfa", null);}else{pmap.put("xiyifangfa", xiyifangfa);}
		if(yifuleixing==null||yifuleixing.equals("")){pmap.put("yifuleixing", null);}else{pmap.put("yifuleixing", yifuleixing);}
		if(zhuyineirong==null||zhuyineirong.equals("")){pmap.put("zhuyineirong", null);}else{pmap.put("zhuyineirong", zhuyineirong);}
		if(jiage==null||jiage.equals("")){pmap.put("jiage", null);}else{pmap.put("jiage", jiage);}
		if(xiadanren==null||xiadanren.equals("")){pmap.put("xiadanren", null);}else{pmap.put("xiadanren", xiadanren);}
		
		int total=gouwucheService.getCount(pmap);
		pageBean.setTotal(total);
		List<Gouwuche> list=gouwucheService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "gouwuche_yanben1";
	}
	@RequestMapping("gouwuche_yanben2.do")
	public String gouwuche_yanben2(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Gouwuche gouwuche, String bianhao, String xiyifangfa, String yifuleixing, String zhuyineirong, String jiage, String xiadanren){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);
		
		
		if(bianhao==null||bianhao.equals("")){pmap.put("bianhao", null);}else{pmap.put("bianhao", bianhao);}
		if(xiyifangfa==null||xiyifangfa.equals("")){pmap.put("xiyifangfa", null);}else{pmap.put("xiyifangfa", xiyifangfa);}
		if(yifuleixing==null||yifuleixing.equals("")){pmap.put("yifuleixing", null);}else{pmap.put("yifuleixing", yifuleixing);}
		if(zhuyineirong==null||zhuyineirong.equals("")){pmap.put("zhuyineirong", null);}else{pmap.put("zhuyineirong", zhuyineirong);}
		if(jiage==null||jiage.equals("")){pmap.put("jiage", null);}else{pmap.put("jiage", jiage);}
		if(xiadanren==null||xiadanren.equals("")){pmap.put("xiadanren", null);}else{pmap.put("xiadanren", xiadanren);}
		
		int total=gouwucheService.getCount(pmap);
		pageBean.setTotal(total);
		List<Gouwuche> list=gouwucheService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "gouwuche_yanben2";
	}
	@RequestMapping("gouwuche_yanben3.do")
	public String gouwuche_yanben3(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Gouwuche gouwuche, String bianhao, String xiyifangfa, String yifuleixing, String zhuyineirong, String jiage, String xiadanren){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);
		
		
		if(bianhao==null||bianhao.equals("")){pmap.put("bianhao", null);}else{pmap.put("bianhao", bianhao);}
		if(xiyifangfa==null||xiyifangfa.equals("")){pmap.put("xiyifangfa", null);}else{pmap.put("xiyifangfa", xiyifangfa);}
		if(yifuleixing==null||yifuleixing.equals("")){pmap.put("yifuleixing", null);}else{pmap.put("yifuleixing", yifuleixing);}
		if(zhuyineirong==null||zhuyineirong.equals("")){pmap.put("zhuyineirong", null);}else{pmap.put("zhuyineirong", zhuyineirong);}
		if(jiage==null||jiage.equals("")){pmap.put("jiage", null);}else{pmap.put("jiage", jiage);}
		if(xiadanren==null||xiadanren.equals("")){pmap.put("xiadanren", null);}else{pmap.put("xiadanren", xiadanren);}
		
		int total=gouwucheService.getCount(pmap);
		pageBean.setTotal(total);
		List<Gouwuche> list=gouwucheService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "gouwuche_yanben3";
	}
	@RequestMapping("gouwuche_yanben4.do")
	public String gouwuche_yanben4(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Gouwuche gouwuche, String bianhao, String xiyifangfa, String yifuleixing, String zhuyineirong, String jiage, String xiadanren){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);
		
		
		if(bianhao==null||bianhao.equals("")){pmap.put("bianhao", null);}else{pmap.put("bianhao", bianhao);}
		if(xiyifangfa==null||xiyifangfa.equals("")){pmap.put("xiyifangfa", null);}else{pmap.put("xiyifangfa", xiyifangfa);}
		if(yifuleixing==null||yifuleixing.equals("")){pmap.put("yifuleixing", null);}else{pmap.put("yifuleixing", yifuleixing);}
		if(zhuyineirong==null||zhuyineirong.equals("")){pmap.put("zhuyineirong", null);}else{pmap.put("zhuyineirong", zhuyineirong);}
		if(jiage==null||jiage.equals("")){pmap.put("jiage", null);}else{pmap.put("jiage", jiage);}
		if(xiadanren==null||xiadanren.equals("")){pmap.put("xiadanren", null);}else{pmap.put("xiadanren", xiadanren);}
		
		int total=gouwucheService.getCount(pmap);
		pageBean.setTotal(total);
		List<Gouwuche> list=gouwucheService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "gouwuche_yanben4";
	}
	@RequestMapping("gouwuche_yanben5.do")
	public String gouwuche_yanben5(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Gouwuche gouwuche, String bianhao, String xiyifangfa, String yifuleixing, String zhuyineirong, String jiage, String xiadanren){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);
		
		
		if(bianhao==null||bianhao.equals("")){pmap.put("bianhao", null);}else{pmap.put("bianhao", bianhao);}
		if(xiyifangfa==null||xiyifangfa.equals("")){pmap.put("xiyifangfa", null);}else{pmap.put("xiyifangfa", xiyifangfa);}
		if(yifuleixing==null||yifuleixing.equals("")){pmap.put("yifuleixing", null);}else{pmap.put("yifuleixing", yifuleixing);}
		if(zhuyineirong==null||zhuyineirong.equals("")){pmap.put("zhuyineirong", null);}else{pmap.put("zhuyineirong", zhuyineirong);}
		if(jiage==null||jiage.equals("")){pmap.put("jiage", null);}else{pmap.put("jiage", jiage);}
		if(xiadanren==null||xiadanren.equals("")){pmap.put("xiadanren", null);}else{pmap.put("xiadanren", xiadanren);}
		
		int total=gouwucheService.getCount(pmap);
		pageBean.setTotal(total);
		List<Gouwuche> list=gouwucheService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "gouwuche_yanben5";
	}
	
	@RequestMapping("gouwucheList2.do")
	public String gouwucheList2(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Gouwuche gouwuche, String bianhao, String xiyifangfa, String yifuleixing, String zhuyineirong, String jiage, String xiadanren,HttpServletRequest request){
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
		if(bianhao==null||bianhao.equals("")){pmap.put("bianhao", null);}else{pmap.put("bianhao", bianhao);}
		if(xiyifangfa==null||xiyifangfa.equals("")){pmap.put("xiyifangfa", null);}else{pmap.put("xiyifangfa", xiyifangfa);}
		if(yifuleixing==null||yifuleixing.equals("")){pmap.put("yifuleixing", null);}else{pmap.put("yifuleixing", yifuleixing);}
		if(zhuyineirong==null||zhuyineirong.equals("")){pmap.put("zhuyineirong", null);}else{pmap.put("zhuyineirong", zhuyineirong);}
		if(jiage==null||jiage.equals("")){pmap.put("jiage", null);}else{pmap.put("jiage", jiage);}
		
		
		int total=gouwucheService.getCount(pmap);
		pageBean.setTotal(total);
		List<Gouwuche> list=gouwucheService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "gouwuche_list2";
	}
	
	
	@RequestMapping("gwcList.do")
	public String gwcList(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Gouwuche gouwuche, String bianhao, String xiyifangfa, String yifuleixing, String zhuyineirong, String jiage, String xiadanren){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);
		
		
		if(bianhao==null||bianhao.equals("")){pmap.put("bianhao", null);}else{pmap.put("bianhao", bianhao);}
		if(xiyifangfa==null||xiyifangfa.equals("")){pmap.put("xiyifangfa", null);}else{pmap.put("xiyifangfa", xiyifangfa);}
		if(yifuleixing==null||yifuleixing.equals("")){pmap.put("yifuleixing", null);}else{pmap.put("yifuleixing", yifuleixing);}
		if(zhuyineirong==null||zhuyineirong.equals("")){pmap.put("zhuyineirong", null);}else{pmap.put("zhuyineirong", zhuyineirong);}
		if(jiage==null||jiage.equals("")){pmap.put("jiage", null);}else{pmap.put("jiage", jiage);}
		if(xiadanren==null||xiadanren.equals("")){pmap.put("xiadanren", null);}else{pmap.put("xiadanren", xiadanren);}
		
		int total=gouwucheService.getCount(pmap);
		pageBean.setTotal(total);
		List<Gouwuche> list=gouwucheService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "gouwuchelist";
	}
	@RequestMapping("gwcListtp.do")
	public String gwcListtp(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Gouwuche gouwuche, String bianhao, String xiyifangfa, String yifuleixing, String zhuyineirong, String jiage, String xiadanren){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);
		
		
		if(bianhao==null||bianhao.equals("")){pmap.put("bianhao", null);}else{pmap.put("bianhao", bianhao);}
		if(xiyifangfa==null||xiyifangfa.equals("")){pmap.put("xiyifangfa", null);}else{pmap.put("xiyifangfa", xiyifangfa);}
		if(yifuleixing==null||yifuleixing.equals("")){pmap.put("yifuleixing", null);}else{pmap.put("yifuleixing", yifuleixing);}
		if(zhuyineirong==null||zhuyineirong.equals("")){pmap.put("zhuyineirong", null);}else{pmap.put("zhuyineirong", zhuyineirong);}
		if(jiage==null||jiage.equals("")){pmap.put("jiage", null);}else{pmap.put("jiage", jiage);}
		if(xiadanren==null||xiadanren.equals("")){pmap.put("xiadanren", null);}else{pmap.put("xiadanren", xiadanren);}
		
		int total=gouwucheService.getCount(pmap);
		pageBean.setTotal(total);
		List<Gouwuche> list=gouwucheService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "gouwuchelisttp";
	}
	
	@RequestMapping("deleteGouwuche.do")
	public String deleteGouwuche(int id,HttpServletRequest request){
		gouwucheService.delete(id);
		String url = request.getHeader("Referer");
		return "redirect:"+url;
		//return "redirect:gouwucheList.do";
	}
	
	
}
