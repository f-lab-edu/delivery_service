package user.delivery.domain.partner;

import user.delivery.domain.user.UserCommand;
import user.delivery.domain.user.UserInfo;

public interface PartnerService {
    PartnerInfo joinPartner(PartnerCommand.JoinPartnerRequest request);
    PartnerInfo updatePartnerNickName(PartnerCommand.UpdatePartnerRequest request);
    PartnerInfo updatePartnerPassword(PartnerCommand.UpdatePartnerPasswordRequest request);
    PartnerInfo findByPartnerId(String phone);
    PartnerInfo changePartnerPasswordByForget(PartnerCommand.UpdatePartnerPasswordRequest request);
    PartnerInfo deletePartner(String userId, String password);

    PartnerOptionInfo applyForStore(PartnerCommand.ApplyForStoreRequest request);
    PartnerOptionInfo expiredForStore(PartnerCommand.ExpiredForStoreRequest request);

}
