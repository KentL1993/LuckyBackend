package com.lucky;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lucky_result")
public class Lucky {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  
  @Column(name = "jackpot", nullable = false)
  private String jackpot;
  
  @Column(name = "round")
  private String round;
  
  @Column(name = "create_date")
  private Date create_date;
  
  @Column(name = "draw_date")
  private Date draw_date;
  
  @Column(name = "update_date")
  private Date update_date;
  
  @Column(name = "prize1")
  private String prize1;
  
  @Column(name = "prize1_from")
  private String prize1_from;
  
  @Column(name = "prize2")
  private String prize2;
  
  @Column(name = "prize2_from")
  private String prize2_from;
  
  @Column(name = "prize3")
  private String prize3;
  
  @Column(name = "prize3_from")
  private String prize3_from;
  
  @Column(name = "prize6D")
  private String prize_6d;
  
  @Column(name = "prize6D_2A")
  private String prize6d_2A;
  
  @Column(name = "prize6D_2B")
  private String prize6d_2B;
  
  @Column(name = "prize6D_3A")
  private String prize6d_3A;
  
  @Column(name = "prize6D_3B")
  private String prize6d_3B;
  
  @Column(name = "prize6D_4A")
  private String prize6d_4A;
  
  @Column(name = "prize6D_4B")
  private String prize6d_4B;
  
  @Column(name = "prize6D_5A")
  private String prize6d_5A;
  
  @Column(name = "prize6D_5B")
  private String prize6d_5B;
  
  @Column(name = "prize_a")
  private String prize_a;
  
  @Column(name = "prize_b")
  private String prize_b;
  
  @Column(name = "prize_c")
  private String prize_c;
  
  @Column(name = "prize_d")
  private String prize_d;
  
  @Column(name = "prize_e")
  private String prize_e;
  
  @Column(name = "prize_f")
  private String prize_f;
  
  @Column(name = "prize_g")
  private String prize_g;
  
  @Column(name = "prize_h")
  private String prize_h;
  
  @Column(name = "prize_i")
  private String prize_i;
  
  @Column(name = "prize_j")
  private String prize_j;
  
  @Column(name = "prize_k")
  private String prize_k;
  
  @Column(name = "prize_l")
  private String prize_l;
  
  @Column(name = "prize_m")
  private String prize_m;
  
  @Column(name = "prize_n")
  private String prize_n;
  
  @Column(name = "prize_o")
  private String prize_o;
  
  @Column(name = "prize_p")
  private String prize_p;
  
  @Column(name = "prize_q")
  private String prize_q;
  
  @Column(name = "prize_r")
  private String prize_r;
  
  @Column(name = "prize_s")
  private String prize_s;
  
  @Column(name = "prize_t")
  private String prize_t;
  
  @Column(name = "prize_u")
  private String prize_u;
  
  @Column(name = "prize_v")
  private String prize_v;
  
  @Column(name = "prize_w")
  private String prize_w;
  
  @Column(name = "is_done")
  private Boolean isDone;
  
  @Column(name = "replaced_Prize")
  private String replacedPrize;
  
  @Column(name = "replaced_Pos")
  private String replacedPos;
  
  @Column(name = "replaced_Value")
  private String replacedValue;
  
  @Column(name = "percent")
  private String percent;
  
  @Column(name = "total_winner_unit")
  private String totalWinnerUnit;
  
  @Column(name = "jackpot_amount_perUnit")
  private String jackpotAmountPerUnit;
  
  @Column(name = "last_draw_pos")
  private String lastDrawPos;
  
  @Column(name = "last_draw_value")
  private String lastDrawValue;
  
  public long getId() {
    return this.id;
  }
  
  public void setId(long id) {
    this.id = id;
  }
  
  public String getJackpot() {
    return this.jackpot;
  }
  
  public void setJackpot(String jackpot) {
    this.jackpot = jackpot;
  }
  
  public String getRound() {
    return this.round;
  }
  
  public void setRound(String round) {
    this.round = round;
  }
  
  public Date getCreate_date() {
    return this.create_date;
  }
  
  public void setCreate_date(Date create_date) {
    this.create_date = create_date;
  }
  
  public Date getDraw_date() {
    return this.draw_date;
  }
  
  public void setDraw_date(Date draw_date) {
    this.draw_date = draw_date;
  }
  
  public Date getUpdate_date() {
    return this.update_date;
  }
  
  public void setUpdate_date(Date update_date) {
    this.update_date = update_date;
  }
  
  public String getPrize1() {
    return this.prize1;
  }
  
  public void setPrize1(String prize1) {
    this.prize1 = prize1;
  }
  
  public String getPrize1_from() {
    return this.prize1_from;
  }
  
  public void setPrize1_from(String prize1_from) {
    this.prize1_from = prize1_from;
  }
  
  public String getPrize2() {
    return this.prize2;
  }
  
  public void setPrize2(String prize2) {
    this.prize2 = prize2;
  }
  
  public String getPrize2_from() {
    return this.prize2_from;
  }
  
  public void setPrize2_from(String prize2_from) {
    this.prize2_from = prize2_from;
  }
  
  public String getPrize3() {
    return this.prize3;
  }
  
  public void setPrize3(String prize3) {
    this.prize3 = prize3;
  }
  
  public String getPrize3_from() {
    return this.prize3_from;
  }
  
  public void setPrize3_from(String prize3_from) {
    this.prize3_from = prize3_from;
  }
  
  public String getPrize_6d() {
    return this.prize_6d;
  }
  
  public void setPrize_6d(String prize_6d) {
    this.prize_6d = prize_6d;
  }
  
  public String getPrize6d_2A() {
    return this.prize6d_2A;
  }
  
  public void setPrize6d_2A(String prize6d_2a) {
    this.prize6d_2A = prize6d_2a;
  }
  
  public String getPrize6d_2B() {
    return this.prize6d_2B;
  }
  
  public void setPrize6d_2B(String prize6d_2b) {
    this.prize6d_2B = prize6d_2b;
  }
  
  public String getPrize6d_3A() {
    return this.prize6d_3A;
  }
  
  public void setPrize6d_3A(String prize6d_3a) {
    this.prize6d_3A = prize6d_3a;
  }
  
  public String getPrize6d_3B() {
    return this.prize6d_3B;
  }
  
  public void setPrize6d_3B(String prize6d_3b) {
    this.prize6d_3B = prize6d_3b;
  }
  
  public String getPrize6d_4A() {
    return this.prize6d_4A;
  }
  
  public void setPrize6d_4A(String prize6d_4a) {
    this.prize6d_4A = prize6d_4a;
  }
  
  public String getPrize6d_4B() {
    return this.prize6d_4B;
  }
  
  public void setPrize6d_4B(String prize6d_4b) {
    this.prize6d_4B = prize6d_4b;
  }
  
  public String getPrize6d_5A() {
    return this.prize6d_5A;
  }
  
  public void setPrize6d_5A(String prize6d_5a) {
    this.prize6d_5A = prize6d_5a;
  }
  
  public String getPrize6d_5B() {
    return this.prize6d_5B;
  }
  
  public void setPrize6d_5B(String prize6d_5b) {
    this.prize6d_5B = prize6d_5b;
  }
  
  public String getPrize_a() {
    return this.prize_a;
  }
  
  public void setPrize_a(String prize_a) {
    this.prize_a = prize_a;
  }
  
  public String getPrize_b() {
    return this.prize_b;
  }
  
  public void setPrize_b(String prize_b) {
    this.prize_b = prize_b;
  }
  
  public String getPrize_c() {
    return this.prize_c;
  }
  
  public void setPrize_c(String prize_c) {
    this.prize_c = prize_c;
  }
  
  public String getPrize_d() {
    return this.prize_d;
  }
  
  public void setPrize_d(String prize_d) {
    this.prize_d = prize_d;
  }
  
  public String getPrize_e() {
    return this.prize_e;
  }
  
  public void setPrize_e(String prize_e) {
    this.prize_e = prize_e;
  }
  
  public String getPrize_f() {
    return this.prize_f;
  }
  
  public void setPrize_f(String prize_f) {
    this.prize_f = prize_f;
  }
  
  public String getPrize_g() {
    return this.prize_g;
  }
  
  public void setPrize_g(String prize_g) {
    this.prize_g = prize_g;
  }
  
  public String getPrize_h() {
    return this.prize_h;
  }
  
  public void setPrize_h(String prize_h) {
    this.prize_h = prize_h;
  }
  
  public String getPrize_i() {
    return this.prize_i;
  }
  
  public void setPrize_i(String prize_i) {
    this.prize_i = prize_i;
  }
  
  public String getPrize_j() {
    return this.prize_j;
  }
  
  public void setPrize_j(String prize_j) {
    this.prize_j = prize_j;
  }
  
  public String getPrize_k() {
    return this.prize_k;
  }
  
  public void setPrize_k(String prize_k) {
    this.prize_k = prize_k;
  }
  
  public String getPrize_l() {
    return this.prize_l;
  }
  
  public void setPrize_l(String prize_l) {
    this.prize_l = prize_l;
  }
  
  public String getPrize_m() {
    return this.prize_m;
  }
  
  public void setPrize_m(String prize_m) {
    this.prize_m = prize_m;
  }
  
  public String getPrize_n() {
    return this.prize_n;
  }
  
  public void setPrize_n(String prize_n) {
    this.prize_n = prize_n;
  }
  
  public String getPrize_o() {
    return this.prize_o;
  }
  
  public void setPrize_o(String prize_o) {
    this.prize_o = prize_o;
  }
  
  public String getPrize_p() {
    return this.prize_p;
  }
  
  public void setPrize_p(String prize_p) {
    this.prize_p = prize_p;
  }
  
  public String getPrize_q() {
    return this.prize_q;
  }
  
  public void setPrize_q(String prize_q) {
    this.prize_q = prize_q;
  }
  
  public String getPrize_r() {
    return this.prize_r;
  }
  
  public void setPrize_r(String prize_r) {
    this.prize_r = prize_r;
  }
  
  public String getPrize_s() {
    return this.prize_s;
  }
  
  public void setPrize_s(String prize_s) {
    this.prize_s = prize_s;
  }
  
  public String getPrize_t() {
    return this.prize_t;
  }
  
  public void setPrize_t(String prize_t) {
    this.prize_t = prize_t;
  }
  
  public String getPrize_u() {
    return this.prize_u;
  }
  
  public void setPrize_u(String prize_u) {
    this.prize_u = prize_u;
  }
  
  public String getPrize_v() {
    return this.prize_v;
  }
  
  public void setPrize_v(String prize_v) {
    this.prize_v = prize_v;
  }
  
  public String getPrize_w() {
    return this.prize_w;
  }
  
  public void setPrize_w(String prize_w) {
    this.prize_w = prize_w;
  }
  
  public Boolean getIsDone() {
    return this.isDone;
  }
  
  public void setIsDone(Boolean isDone) {
    this.isDone = isDone;
  }
  
  public String getReplacedPrize() {
    return this.replacedPrize;
  }
  
  public void setReplacedPrize(String replacedPrize) {
    this.replacedPrize = replacedPrize;
  }
  
  public String getReplacedPos() {
    return this.replacedPos;
  }
  
  public void setReplacedPos(String replacedPos) {
    this.replacedPos = replacedPos;
  }
  
  public String getReplacedValue() {
    return this.replacedValue;
  }
  
  public void setReplacedValue(String replacedValue) {
    this.replacedValue = replacedValue;
  }
  
  public String getPercent() {
    return this.percent;
  }
  
  public void setPercent(String percent) {
    this.percent = percent;
  }
  
  public String getTotalWinnerUnit() {
    return this.totalWinnerUnit;
  }
  
  public void setTotalWinnerUnit(String totalWinnerUnit) {
    this.totalWinnerUnit = totalWinnerUnit;
  }
  
  public String getJackpotAmountPerUnit() {
    return this.jackpotAmountPerUnit;
  }
  
  public void setJackpotAmountPerUnit(String jackpotAmountPerUnit) {
    this.jackpotAmountPerUnit = jackpotAmountPerUnit;
  }
  
  public String getLastDrawPos() {
    return this.lastDrawPos;
  }
  
  public void setLastDrawPos(String lastDrawPos) {
    this.lastDrawPos = lastDrawPos;
  }
  
  public String getLastDrawValue() {
    return this.lastDrawValue;
  }
  
  public void setLastDrawValue(String lastDrawValue) {
    this.lastDrawValue = lastDrawValue;
  }
}
