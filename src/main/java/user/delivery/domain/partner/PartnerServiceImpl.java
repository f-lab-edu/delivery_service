package user.delivery.domain.partner;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import user.delivery.domain.partner.repository.PartnerReader;
import user.delivery.domain.partner.repository.PartnerSave;
import user.delivery.domain.user.repository.UserReader;
import user.delivery.domain.user.repository.UserSave;

@Slf4j
@Service
@RequiredArgsConstructor
public class PartnerServiceImpl implements PartnerService{
    private final PartnerSave partnerSave;
    private final PartnerReader partnerReader;


    @Override
    public PartnerOptionInfo applyForStore(PartnerCommand.ApplyForStoreRequest request) {
        //partner가 있는지 확인
        //partneroption 으로 가게정보 저장
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
