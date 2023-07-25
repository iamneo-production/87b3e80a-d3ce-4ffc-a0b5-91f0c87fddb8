package com.example.demo.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Model.Bank;
import com.example.demo.Model.Bankaccount;
import com.example.demo.Model.Customers;

import com.example.demo.Service.ApiService;
import com.example.demo.Service.BankaccountService;
import com.example.demo.Service.CustomerService;
@CrossOrigin
@RestController
public class ApiController {
	
	@Autowired 
	ApiService stuService;
	@Autowired
	CustomerService stdService;
	@Autowired
	BankaccountService stmService;
	@PostMapping("/addlogin")
	public Bank addInfo(@RequestBody Bank st)
	{
		return stuService.saveDetails(st);
		}
	@PostMapping("/addsign")
	public Customers addInfo1(@RequestBody Customers cr )
	{
		return stdService.savesign(cr);
		}
	@PostMapping("/addacc")
	public Bankaccount addInfo2(@RequestBody Bankaccount ar )
	{
		return stmService.saveacc(ar);
		}
	@GetMapping("/showlogin")
		public List<Bank>fetchDetails(){
			return stuService.getDetails();
			}
	@GetMapping("/showsign")
	public List<Customers>fetchDetails1(){
		return stdService.getsign();
		}
	@GetMapping("/showacc")
	public List<Bankaccount>fetchDetails2(){
		return stmService.getAcc();
		}
		@PutMapping("/updatelogin")
		public Bank UpdateInfo(@RequestBody Bank st1){
			return stuService.UpdateDetails(st1);
			}
		@PutMapping("/updatesign")
		public Customers UpdateInfo1(@RequestBody Customers st2){
			return stdService.Updatesign(st2);
			}
		@PutMapping("/updateacc")
		public Bankaccount UpdateInfo2(@RequestBody Bankaccount st3){
			return stmService.Updateacc(st3);
			}
		
		@DeleteMapping("/Del/{id}")
		public String deleteInfo (@PathVariable("id")int id) {
			stuService.deleteDetails(id);
			return "Deleted details";
			}
		@DeleteMapping("/Dele/{id}")
		public String deleteInfo1 (@PathVariable("id")int id) {
			stdService.deletesign(id);
			return "Deleted details";
			}
		@DeleteMapping("/Delet/{id}")
		public String deleteInfo2 (@PathVariable("id")int id) {
			stmService.deleteacc(id);
			return "Deleted details";
			}
		
		}