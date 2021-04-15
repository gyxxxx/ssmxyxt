package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.alibaba.fastjson.JSONObject;
import com.entity.Guizixinxi;
import com.server.GuizixinxiServer;
import com.util.PageBean;
@Controller
public class GuizixinxiController {
	@Resource
	private GuizixinxiServer guizixinxiService;


   
	@RequestMapping("addGuizixinxi.do")
	public String addGuizixinxi(HttpServletRequest request,Guizixinxi guizixinxi,HttpSession session) throws SQLException{
		Timestamp time=new Timestamp(System.currentTimeMillis());
		
		guizixinxi.setAddtime(time.toString().substring(0, 19));
		guizixinxiService.add(guizixinxi);
		
		session.setAttribute("backxx", "添加成功");
		session.setAttribute("backurl", request.getHeader("Referer"));
		
		//session.setAttribute("backurl", "guizixinxiList.do");
		
		return "redirect:postback.jsp";
		//return "redirect:guizixinxiList.do";
		
		
		
	}
 
//	处理编辑
	@RequestMapping("doUpdateGuizixinxi.do")
	public String doUpdateGuizixinxi(int id,ModelMap map,Guizixinxi guizixinxi){
		guizixinxi=guizixinxiService.getById(id);
		map.put("guizixinxi", guizixinxi);
		return "guizixinxi_updt";
	}
	
	
	
	
	
//	后台详细
	@RequestMapping("guizixinxiDetail.do")
	public String guizixinxiDetail(int id,ModelMap map,Guizixinxi guizixinxi){
		guizixinxi=guizixinxiService.getById(id);
		map.put("guizixinxi", guizixinxi);
		return "guizixinxi_detail";
	}
//	前台详细
	@RequestMapping("gzxxDetail.do")
	public String gzxxDetail(int id,ModelMap map,Guizixinxi guizixinxi){
		guizixinxi=guizixinxiService.getById(id);
		map.put("guizixinxi", guizixinxi);
		return "guizixinxidetail";
	}
//	
	@RequestMapping("updateGuizixinxi.do")
	public String updateGuizixinxi(int id,ModelMap map,Guizixinxi guizixinxi,HttpServletRequest request,HttpSession session){
		guizixinxiService.update(guizixinxi);
		session.setAttribute("backxx", "修改成功");
		session.setAttribute("backurl", request.getHeader("Referer"));
		return "redirect:postback.jsp";
		//String url = request.getHeader("Referer");
		//return "redirect:"+url;
		//return "redirect:guizixinxiList.do";
	}

//	分页查询
	@RequestMapping("guizixinxiList.do")
	public String guizixinxiList(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Guizixinxi guizixinxi, String huoguibianhao, String guige, String weizhi){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);
		
		
		if(huoguibianhao==null||huoguibianhao.equals("")){pmap.put("huoguibianhao", null);}else{pmap.put("huoguibianhao", huoguibianhao);}		if(guige==null||guige.equals("")){pmap.put("guige", null);}else{pmap.put("guige", guige);}		if(weizhi==null||weizhi.equals("")){pmap.put("weizhi", null);}else{pmap.put("weizhi", weizhi);}		
		int total=guizixinxiService.getCount(pmap);
		pageBean.setTotal(total);
		List<Guizixinxi> list=guizixinxiService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "guizixinxi_list";
	}
	
	@RequestMapping("guizixinxi_yanben1.do")
	public String guizixinxi_yanben1(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Guizixinxi guizixinxi, String huoguibianhao, String guige, String weizhi){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);
		
		
		if(huoguibianhao==null||huoguibianhao.equals("")){pmap.put("huoguibianhao", null);}else{pmap.put("huoguibianhao", huoguibianhao);}		if(guige==null||guige.equals("")){pmap.put("guige", null);}else{pmap.put("guige", guige);}		if(weizhi==null||weizhi.equals("")){pmap.put("weizhi", null);}else{pmap.put("weizhi", weizhi);}		
		int total=guizixinxiService.getCount(pmap);
		pageBean.setTotal(total);
		List<Guizixinxi> list=guizixinxiService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "guizixinxi_yanben1";
	}
	@RequestMapping("guizixinxi_yanben2.do")
	public String guizixinxi_yanben2(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Guizixinxi guizixinxi, String huoguibianhao, String guige, String weizhi){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);
		
		
		if(huoguibianhao==null||huoguibianhao.equals("")){pmap.put("huoguibianhao", null);}else{pmap.put("huoguibianhao", huoguibianhao);}		if(guige==null||guige.equals("")){pmap.put("guige", null);}else{pmap.put("guige", guige);}		if(weizhi==null||weizhi.equals("")){pmap.put("weizhi", null);}else{pmap.put("weizhi", weizhi);}		
		int total=guizixinxiService.getCount(pmap);
		pageBean.setTotal(total);
		List<Guizixinxi> list=guizixinxiService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "guizixinxi_yanben2";
	}
	@RequestMapping("guizixinxi_yanben3.do")
	public String guizixinxi_yanben3(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Guizixinxi guizixinxi, String huoguibianhao, String guige, String weizhi){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);
		
		
		if(huoguibianhao==null||huoguibianhao.equals("")){pmap.put("huoguibianhao", null);}else{pmap.put("huoguibianhao", huoguibianhao);}		if(guige==null||guige.equals("")){pmap.put("guige", null);}else{pmap.put("guige", guige);}		if(weizhi==null||weizhi.equals("")){pmap.put("weizhi", null);}else{pmap.put("weizhi", weizhi);}		
		int total=guizixinxiService.getCount(pmap);
		pageBean.setTotal(total);
		List<Guizixinxi> list=guizixinxiService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "guizixinxi_yanben3";
	}
	@RequestMapping("guizixinxi_yanben4.do")
	public String guizixinxi_yanben4(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Guizixinxi guizixinxi, String huoguibianhao, String guige, String weizhi){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);
		
		
		if(huoguibianhao==null||huoguibianhao.equals("")){pmap.put("huoguibianhao", null);}else{pmap.put("huoguibianhao", huoguibianhao);}		if(guige==null||guige.equals("")){pmap.put("guige", null);}else{pmap.put("guige", guige);}		if(weizhi==null||weizhi.equals("")){pmap.put("weizhi", null);}else{pmap.put("weizhi", weizhi);}		
		int total=guizixinxiService.getCount(pmap);
		pageBean.setTotal(total);
		List<Guizixinxi> list=guizixinxiService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "guizixinxi_yanben4";
	}
	@RequestMapping("guizixinxi_yanben5.do")
	public String guizixinxi_yanben5(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Guizixinxi guizixinxi, String huoguibianhao, String guige, String weizhi){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);
		
		
		if(huoguibianhao==null||huoguibianhao.equals("")){pmap.put("huoguibianhao", null);}else{pmap.put("huoguibianhao", huoguibianhao);}		if(guige==null||guige.equals("")){pmap.put("guige", null);}else{pmap.put("guige", guige);}		if(weizhi==null||weizhi.equals("")){pmap.put("weizhi", null);}else{pmap.put("weizhi", weizhi);}		
		int total=guizixinxiService.getCount(pmap);
		pageBean.setTotal(total);
		List<Guizixinxi> list=guizixinxiService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "guizixinxi_yanben5";
	}
	
	
	
	@RequestMapping("gzxxList.do")
	public String gzxxList(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Guizixinxi guizixinxi, String huoguibianhao, String guige, String weizhi){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);
		
		
		if(huoguibianhao==null||huoguibianhao.equals("")){pmap.put("huoguibianhao", null);}else{pmap.put("huoguibianhao", huoguibianhao);}		if(guige==null||guige.equals("")){pmap.put("guige", null);}else{pmap.put("guige", guige);}		if(weizhi==null||weizhi.equals("")){pmap.put("weizhi", null);}else{pmap.put("weizhi", weizhi);}		
		int total=guizixinxiService.getCount(pmap);
		pageBean.setTotal(total);
		List<Guizixinxi> list=guizixinxiService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "guizixinxilist";
	}
	@RequestMapping("gzxxListtp.do")
	public String gzxxListtp(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Guizixinxi guizixinxi, String huoguibianhao, String guige, String weizhi){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);
		
		
		if(huoguibianhao==null||huoguibianhao.equals("")){pmap.put("huoguibianhao", null);}else{pmap.put("huoguibianhao", huoguibianhao);}		if(guige==null||guige.equals("")){pmap.put("guige", null);}else{pmap.put("guige", guige);}		if(weizhi==null||weizhi.equals("")){pmap.put("weizhi", null);}else{pmap.put("weizhi", weizhi);}		
		int total=guizixinxiService.getCount(pmap);
		pageBean.setTotal(total);
		List<Guizixinxi> list=guizixinxiService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "guizixinxilisttp";
	}
	
	@RequestMapping("deleteGuizixinxi.do")
	public String deleteGuizixinxi(int id,HttpServletRequest request){
		guizixinxiService.delete(id);
		String url = request.getHeader("Referer");
		return "redirect:"+url;
		//return "redirect:guizixinxiList.do";
	}
	
	@RequestMapping("quchongGuizixinxi.do")
	public void quchongGuizixinxi(Guizixinxi guizixinxi,HttpServletResponse response){
		   Map<String,Object> map=new HashMap<String,Object>();
		   map.put("huoguibianhao", guizixinxi.getHuoguibianhao());
		   System.out.println("huoguibianhao==="+guizixinxi.getHuoguibianhao());
		   System.out.println("huoguibianhao222==="+guizixinxiService.quchongGuizixinxi(map));
		   JSONObject obj=new JSONObject();
		   if(guizixinxiService.quchongGuizixinxi(map)!=null){
				 obj.put("info", "ng");
			   }else{
				   obj.put("info", "货柜编号可以用！");
				  
			   }
		   response.setContentType("text/html;charset=utf-8");
		   PrintWriter out=null;
		   try {
			out=response.getWriter();
			out.print(obj);
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			out.close();
		}
	}
}
