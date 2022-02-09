package com.IRCTCRestApi.Repo;




import org.springframework.data.repository.CrudRepository;


import com.IRCTCRestApi.Model.TicketInfoModel;

public interface TicketInfoRepo extends CrudRepository<TicketInfoModel, Long> {
		
		
		public TicketInfoModel findTicketInfoByPnr(String pnr);

		public void save(com.IRCTCRestApi.Response.TicketInfo ticketInfo);

}
