package kr.co.eodeatzy.manage;

import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import com.sun.tools.sjavac.Log;

@Controller
public class manageController {
	
private static final Logger logger = LoggerFactory.getLogger(manageController.class);

	@Autowired
	manageService service;

	@RequestMapping(value="manage/boardList", method = RequestMethod.GET)
	public String boardList() throws Exception {
		
		return "boardList";
	}	
	

	@RequestMapping(value = "manage/noticeList", method = RequestMethod.GET)
	public String noticeList(Model model) {
		model.addAttribute("msg","테스트페이지로슝");
		
		return "noticeList";
	}	
	
	@RequestMapping(value = "manage/manageList", method = RequestMethod.GET)
	public ModelAndView manageList(Model model) throws Exception {
		System.out.println("manageList!!!!!!!!!!!!1");
		ModelAndView mav = new ModelAndView();
	
		List<comboDTO> comboList  = service.comboList();
		mav.addObject("comboList", comboList);
		
		mav.setViewName("manageList");
		return mav;
	}

	@RequestMapping(value = "manage/manageListAll", method = RequestMethod.GET)
	public ModelAndView manageListAll(inputDTO inputDTO) throws Exception {
		System.out.println("manageListAll@@@@@@@@@@@@22"+inputDTO.getHidden_upId());
		ModelAndView mav = new ModelAndView();
		
		if(inputDTO.getHidden_upId() == 1) {				//게시판_테이블
			List<boardDTO> tbBoardList  = service.tbBoardList();
			mav.addObject("tbBoardList", tbBoardList);
		} else if(inputDTO.getHidden_upId() == 2) {			//장바구니_테이블
			List<cartDTO> tbCartList  = service.tbCartList();
			mav.addObject("tbCartList", tbCartList);
		} else if(inputDTO.getHidden_upId() == 3) {			//카테고리분류_테이블
			List<categoryDTO> tbCateList  = service.tbCateList();
			mav.addObject("tbCateList", tbCateList);
		} else if(inputDTO.getHidden_upId() == 4) {			//콤보리스트_테이블
			List<comboDTO> tbComboList  = service.comboList();
			mav.addObject("tbComboList", tbComboList);	
		} else if(inputDTO.getHidden_upId() == 5) {			//댓글_테이블
			List<commentDTO> tbCmtList  = service.tbCmtList();
			mav.addObject("tbCmtList", tbCmtList);
		} else if(inputDTO.getHidden_upId() == 6) {			//메뉴_테이블
			List<menuDTO> tbMenuList  = service.tbMenuList();
			mav.addObject("tbMenuList", tbMenuList);
		} else if(inputDTO.getHidden_upId() == 7) {			//주문내역_테이블
			List<orderDTO> tbOrderList  = service.tbOrderList();
			mav.addObject("tbOrderList", tbOrderList);
		} else if(inputDTO.getHidden_upId() == 8) {			//주문내역_상세_테이블
			List<orderDetailDTO> tbOrderDtlList  = service.tbOrderDtlList();
			mav.addObject("tbOrderDtlList", tbOrderDtlList);
		} else if(inputDTO.getHidden_upId() == 9) {			//사업장정보_테이블
			List<storeDTO> tbStoreList  = service.tbStoreList();
			mav.addObject("tbStoreList", tbStoreList);
		} else if(inputDTO.getHidden_upId() == 10) {		//사업장_주소_테이블
			List<storeAdresDTO> tbStoreAdresList  = service.tbStoreAdresList();
			mav.addObject("tbStoreAdresList", tbStoreAdresList);
		} else if(inputDTO.getHidden_upId() == 11) {		//사업자정보_테이블
			List<userBDTO> tbUserbList  = service.tbUserbList();
			mav.addObject("tbUserbList", tbUserbList);
		} else if(inputDTO.getHidden_upId() == 12) {		//개인사용자정보_테이블
			List<userPDTO> tbUserPList  = service.userPList();
			mav.addObject("tbUserPList", tbUserPList);
		} else if(inputDTO.getHidden_upId() == 13) {		//개인사용자_주소_테이블
			List<userPAdresDTO> tbUserPAdresList  = service.tbUserPAdresList();
			mav.addObject("tbUserPAdresList", tbUserPAdresList);		
		} else if(inputDTO.getHidden_upId() == 14) {		//찜목록_테이블
			List<zzimDTO> tbZzimList  = service.tbZzimList();
			mav.addObject("tbZzimList", tbZzimList);
		}
		
		mav.addObject("setUpId", inputDTO.getHidden_upId());
		
		List<comboDTO> comboList  = service.comboList();
		mav.addObject("comboList", comboList);
		
		mav.setViewName("manageList");
		return mav;
	}
	//관리자_insert_화면_조회
	@RequestMapping(value = "manage/manageEditInsert", method = RequestMethod.GET)
	public ModelAndView manageEditInsert(Model model, inputDTO inputDTO) {
		
		ModelAndView mav = new ModelAndView();
		model.addAttribute("msg","manageEditInsert 페이지 *****************");
		mav.addObject("upId", inputDTO.getHidden_upId());
		mav.setViewName("manageEditInsert");
		return mav;
	}
	
	//관리자_insert_게시판테이블
	@RequestMapping(value = "manage/manageInsertTbBoard", method = RequestMethod.POST)
	public ModelAndView manageInsert(Model model, boardDTO boardDTO) {

		ModelAndView mav = new ModelAndView();
		model.addAttribute("msg","manageEditInsert 페이지 *****************");
		//mav.addObject("upId", inputDTO.getHidden_upId());
		mav.setViewName("manageEditInsert");
		return mav;
	}	
	
	//관리자_Update&Delete_화면_조회
	@RequestMapping(value="manage/manageListEdit", method = RequestMethod.GET)
	public ModelAndView manageListEdit(Model model, inputDTO inputDTO) throws Exception {
		
		System.out.println("manageEdit@@@@@@@@@@@@" + inputDTO.getHidden_upId());
		
		ModelAndView mav = new ModelAndView();
		
		if(inputDTO.getHidden_upId() == 1) {					//게시판_테이블
			boardDTO board  = service.tbBoardListOne(inputDTO);
			mav.addObject("board", board);
		} else if(inputDTO.getHidden_upId() == 2) {			//장바구니_테이블
			List<cartDTO> tbCartList  = service.tbCartList();
			//mav.addObject("tbCartList", tbCartList);
		} else if(inputDTO.getHidden_upId() == 3) {			//카테고리분류_테이블
			List<categoryDTO> tbCateList  = service.tbCateList();
			//mav.addObject("tbCateList", tbCateList);
		} else if(inputDTO.getHidden_upId() == 4) {			//콤보리스트_테이블
			List<comboDTO> tbComboList  = service.comboList();
			//mav.addObject("tbComboList", tbComboList);	
		} else if(inputDTO.getHidden_upId() == 5) {			//댓글_테이블
			List<commentDTO> tbCmtList  = service.tbCmtList();
			//mav.addObject("tbCmtList", tbCmtList);
		} else if(inputDTO.getHidden_upId() == 6) {			//메뉴_테이블
			List<menuDTO> tbMenuList  = service.tbMenuList();
			//mav.addObject("tbMenuList", tbMenuList);
		} else if(inputDTO.getHidden_upId() == 7) {			//주문내역_테이블
			List<orderDTO> tbOrderList  = service.tbOrderList();
			//mav.addObject("tbOrderList", tbOrderList);
		} else if(inputDTO.getHidden_upId() == 8) {			//주문내역_상세_테이블
			List<orderDetailDTO> tbOrderDtlList  = service.tbOrderDtlList();
			//mav.addObject("tbOrderDtlList", tbOrderDtlList);
		} else if(inputDTO.getHidden_upId() == 9) {			//사업장정보_테이블
			List<storeDTO> tbStoreList  = service.tbStoreList();
			//mav.addObject("tbStoreList", tbStoreList);
		} else if(inputDTO.getHidden_upId() == 10) {		//사업장_주소_테이블
			List<storeAdresDTO> tbStoreAdresList  = service.tbStoreAdresList();
			//mav.addObject("tbStoreAdresList", tbStoreAdresList);
		} else if(inputDTO.getHidden_upId() == 11) {		//사업자정보_테이블
			List<userBDTO> tbUserbList  = service.tbUserbList();
			mav.addObject("tbUserbList", tbUserbList);
		} else if(inputDTO.getHidden_upId() == 12) {		//개인사용자정보_테이블
			List<userPDTO> tbUserPList  = service.userPList();
			//mav.addObject("tbUserPList", tbUserPList);
		} else if(inputDTO.getHidden_upId() == 13) {		//개인사용자_주소_테이블
			List<userPAdresDTO> tbUserPAdresList  = service.tbUserPAdresList();
			//mav.addObject("tbUserPAdresList", tbUserPAdresList);		
		} else if(inputDTO.getHidden_upId() == 14) {		//찜목록_테이블
			List<zzimDTO> tbZzimList  = service.tbZzimList();
			//mav.addObject("tbZzimList", tbZzimList);
		}
		
		mav.addObject("upId", inputDTO.getHidden_upId());
		mav.addObject("btnGb", inputDTO.getBtnGb());
		
		if(inputDTO.getBtnGb() == 2) {
			mav.setViewName("manageEditUpdate");
		} else if (inputDTO.getBtnGb() == 3) {
			mav.setViewName("manageEditDelete");
		}
		return mav;
	}
	

}