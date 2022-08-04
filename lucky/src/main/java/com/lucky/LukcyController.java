package com.lucky;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

@RestController
@CrossOrigin
@RequestMapping({"/api/v1"})
public class LukcyController {
  @Autowired
  private LuckyRepository luckyRepository;
  
  @GetMapping({"/result"})
  public String findLastestLuckyResult() {
    Lucky lucky = this.luckyRepository.findLastestLuckyResult();
    return (new Gson()).toJson(lucky);
  }
  
  @GetMapping({"/result/{id}"})
  public ResponseEntity<Lucky> getResultById(@PathVariable("id") Long id) throws Exception {
    Lucky lucky = (Lucky)this.luckyRepository.getReferenceById(id);
    return ResponseEntity.ok().body(lucky);
  }
  
  @PostMapping({"/createRecord/{dateStr}/{jackpot}/{round}"})
  public String createRecord(@PathVariable("dateStr") String dateStr, @PathVariable("jackpot") String jackpot, @PathVariable(value = "round", required = false) String round) {
    Lucky lucky = new Lucky();
    if (dateStr != null)
      try {
        Date date = (new SimpleDateFormat("yyyy-MM-dd")).parse(dateStr);
        lucky.setDraw_date(date);
        lucky.setJackpot(jackpot);
        if (round != null && StringUtils.isNotBlank(round) && !round.equals("empty"))
          lucky.setRound(round); 
        lucky.setCreate_date(new Date());
        lucky.setIsDone(Boolean.valueOf(false));
        lucky = (Lucky)this.luckyRepository.save(lucky);
        this.luckyRepository.flush();
        //return String.valueOf(lucky.getId());
        return (new Gson()).toJson(lucky.getId());
      } catch (ParseException e) {
        e.printStackTrace();
      }  
    return null;
  }
  
  @PutMapping({"/updateRecord/{id}/{pos}/{value}"})
  public String updateRecord(@PathVariable("id") String id, @PathVariable("pos") String pos, @PathVariable("value") String value) {
    try {
      Lucky lucky = (Lucky)this.luckyRepository.getReferenceById(Long.valueOf(id));
      if (lucky != null) {
        Constant obj = Constant.getObjByValue(pos);
        switch (obj) {
          case A:
            lucky.setPrize_a(value);
            break;
          case B:
            lucky.setPrize_b(value);
            break;
          case C:
            lucky.setPrize_c(value);
            break;
          case D:
            lucky.setPrize_d(value);
            break;
          case E:
            lucky.setPrize_e(value);
            break;
          case F:
            lucky.setPrize_f(value);
            break;
          case G:
            lucky.setPrize_g(value);
            break;
          case H:
            lucky.setPrize_h(value);
            break;
          case I:
            lucky.setPrize_i(value);
            break;
          case J:
            lucky.setPrize_j(value);
            break;
          case K:
            lucky.setPrize_k(value);
            break;
          case L:
            lucky.setPrize_l(value);
            break;
          case M:
            lucky.setPrize_m(value);
            break;
          case N:
            lucky.setPrize_n(value);
            break;
          case O:
            lucky.setPrize_o(value);
            break;
          case P:
            lucky.setPrize_p(value);
            break;
          case Q:
            lucky.setPrize_q(value);
            break;
          case R:
            lucky.setPrize_r(value);
            break;
          case S:
            lucky.setPrize_s(value);
            break;
          case T:
            lucky.setPrize_t(value);
            break;
          case U:
            lucky.setPrize_u(value);
            break;
          case V:
            lucky.setPrize_v(value);
            break;
          case W:
            lucky.setPrize_w(value);
            break;
		default:
			break;
        } 
      } 
      lucky.setUpdate_date(new Date());
      lucky = (Lucky)this.luckyRepository.save(lucky);
      this.luckyRepository.flush();
      return (new Gson()).toJson(lucky);
    } catch (Exception e) {
      e.printStackTrace();
      throw e;
    } 
  }
  
  @PutMapping({"/updatePrize/{id}/{pos}/{value}/{prizeType}"})
  public String updatePrize(@PathVariable("id") String id, @PathVariable("pos") String pos, @PathVariable("value") String value, @PathVariable("prizeType") String prizeType) {
    try {
      Lucky lucky = (Lucky)this.luckyRepository.getReferenceById(Long.valueOf(id));
      if (lucky != null && StringUtils.isNotBlank(prizeType)) {
        Constant obj = Constant.getObjByValue(prizeType);
        switch (obj) {
          case PRIZE_1:
            if (StringUtils.isNotBlank(lucky.getReplacedPrize()) && 
              !lucky.getReplacedPrize().equals(Constant.PRIZE_1.getValue()))
              lucky.setReplacedPrize(null); 
            if (StringUtils.isNotBlank(lucky.getPrize1()) && StringUtils.isNotBlank(lucky.getPrize1_from())) {
              lucky.setReplacedPrize(prizeType);
              lucky.setReplacedPos(lucky.getPrize1_from());
              lucky.setReplacedValue(lucky.getPrize1());
            } 
            lucky.setPrize1_from(pos);
            lucky.setPrize1(value);
            break;
          case PRIZE_2:
            if (StringUtils.isNotBlank(lucky.getReplacedPrize()) && 
              !lucky.getReplacedPrize().equals(Constant.PRIZE_2.getValue()))
              lucky.setReplacedPrize(null); 
            if (StringUtils.isNotBlank(lucky.getPrize2()) && StringUtils.isNotBlank(lucky.getPrize2_from())) {
              lucky.setReplacedPrize(prizeType);
              lucky.setReplacedPos(lucky.getPrize2_from());
              lucky.setReplacedValue(lucky.getPrize2());
            } 
            lucky.setPrize2_from(pos);
            lucky.setPrize2(value);
            break;
          case PRIZE_3:
            if (StringUtils.isNotBlank(lucky.getReplacedPrize()) && 
              !lucky.getReplacedPrize().equals(Constant.PRIZE_3.getValue()))
              lucky.setReplacedPrize(null); 
            if (StringUtils.isNotBlank(lucky.getPrize3()) && StringUtils.isNotBlank(lucky.getPrize3_from())) {
              lucky.setReplacedPrize(prizeType);
              lucky.setReplacedPos(lucky.getPrize3_from());
              lucky.setReplacedValue(lucky.getPrize3());
            } 
            lucky.setPrize3_from(pos);
            lucky.setPrize3(value);
            break;
		default:
			break;
        } 
      } 
      lucky = (Lucky)this.luckyRepository.save(lucky);
      this.luckyRepository.flush();
      return (new Gson()).toJson(lucky);
    } catch (Exception e) {
      e.printStackTrace();
      throw e;
    } 
  }
  
  @PutMapping({"/updatePrize6d/{id}/{value}/{ascArray}/{dscArray}"})
  public String updatePrize6d(@PathVariable("id") String id, @PathVariable("value") String value, @PathVariable String[] ascArray, @PathVariable String[] dscArray) {
    try {
      Lucky lucky = (Lucky)this.luckyRepository.getReferenceById(Long.valueOf(id));
      if (lucky != null) {
        if (StringUtils.isNotBlank(value))
          lucky.setPrize_6d(value); 
        lucky.setPrize6d_2B(ascArray[0]);
        lucky.setPrize6d_3B(ascArray[1]);
        lucky.setPrize6d_4B(ascArray[2]);
        lucky.setPrize6d_5B(ascArray[3]);
        lucky.setPrize6d_2A(dscArray[0]);
        lucky.setPrize6d_3A(dscArray[1]);
        lucky.setPrize6d_4A(dscArray[2]);
        lucky.setPrize6d_5A(dscArray[3]);
      } 
      lucky = (Lucky)this.luckyRepository.save(lucky);
      this.luckyRepository.flush();
      return (new Gson()).toJson(lucky);
    } catch (Exception e) {
      e.printStackTrace();
      throw e;
    } 
  }
  
  @PutMapping({"/saveJackpotInformation/{id}/{percent}/{totalWinnerUnit}/{jackpotAmountPerUnit}"})
  public String saveJackpotInformation(@PathVariable("id") String id, @PathVariable("percent") String percent, @PathVariable("totalWinnerUnit") String totalWinnerUnit, @PathVariable("jackpotAmountPerUnit") String jackpotAmountPerUnit) {
    try {
      Lucky lucky = (Lucky)this.luckyRepository.getReferenceById(Long.valueOf(id));
      if (lucky != null) {
        if (StringUtils.isNotBlank(jackpotAmountPerUnit))
          lucky.setJackpotAmountPerUnit(jackpotAmountPerUnit); 
        if (StringUtils.isNotBlank(totalWinnerUnit))
          lucky.setTotalWinnerUnit(totalWinnerUnit); 
        if (StringUtils.isNotBlank(percent))
          lucky.setPercent(percent); 
      } 
      lucky = (Lucky)this.luckyRepository.save(lucky);
      this.luckyRepository.flush();
      return (new Gson()).toJson(lucky);
    } catch (Exception e) {
      e.printStackTrace();
      throw e;
    } 
  }
  
  @PutMapping({"/setDrawCompleted/{id}"})
  public String setDrawCompleted(@PathVariable("id") String id) {
    try {
      Lucky lucky = (Lucky)this.luckyRepository.getReferenceById(Long.valueOf(id));
      if (lucky != null)
        lucky.setIsDone(Boolean.valueOf(true)); 
      lucky = (Lucky)this.luckyRepository.save(lucky);
      this.luckyRepository.flush();
      return String.valueOf(lucky.getId());
    } catch (Exception e) {
      e.printStackTrace();
      throw e;
    } 
  }
  
  @PostMapping({"/testArray/{ascArray}/{dscArray}"})
  public String testArray(@PathVariable("ascArray") String[] ascArray, @PathVariable("dscArray") String[] dscArray) {
    if (ascArray.length > 0)
      for (String str : ascArray)
        System.out.println("str : " + str);  
    if (dscArray.length > 0)
      for (String str : dscArray)
        System.out.println("str : " + str);  
    return (new Gson()).toJson(ascArray);
  }
}
