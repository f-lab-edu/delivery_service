package user.delivery.domain.partner;

public class PartnerServiceImpl implements PartnerService{

    @Override
    public PartnerOptionInfo applyForStore(PartnerCommand.ApplyForStoreRequest request) {


        return null;
    }

    @Override
    public PartnerOptionInfo expiredForStore(PartnerCommand.ExpiredForStoreRequest request) {
        //TODO: 가게 삭제가 아닌 상태변경으로 처리해야한다.
        return null;
    }




    @Override
    public PartnerInfo joinPartner(PartnerCommand.JoinPartnerRequest request) {
        return null;
    }

    @Override
    public PartnerInfo updatePartnerNickName(PartnerCommand.UpdatePartnerRequest request) {
        return null;
    }

    @Override
    public PartnerInfo updatePartnerPassword(PartnerCommand.UpdatePartnerPasswordRequest request) {
        return null;
    }

    @Override
    public PartnerInfo findByPartnerId(String phone) {
        return null;
    }

    @Override
    public PartnerInfo changePartnerPasswordByForget(PartnerCommand.UpdatePartnerPasswordRequest request) {
        return null;
    }

    @Override
    public PartnerInfo deletePartner(String userId, String password) {
        //TODO: 파트너 삭제가 아닌 상태변경으로 처리해야한다.
        return null;
    }


}
