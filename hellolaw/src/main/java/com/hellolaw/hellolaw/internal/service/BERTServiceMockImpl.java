package com.hellolaw.hellolaw.internal.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hellolaw.hellolaw.internal.dto.PrecedentDto;

@Service
public class BERTServiceMockImpl implements BERTService {
	@Override
	public PrecedentDto getSimilarPrecedent(String question) {
		return new PrecedentDto(2041, "2008나92864",
			LocalDate.of(2009, 07, 16), "서울고등법원", "손해배상(기)",
			1, 1, 2,
			List.of("민사소송법 제420조&토양환경보전법 시행령 제17조의 4",
				"민사소송법 제344조",
				"민사소송법 제349조&민법 제580조"),
			" 제1심 판결을 다음과 같이 변경한다.&원고에게, 피고 000은 4,639,789,926원, 피고 000는 피고 000과 각자 위 금원 중 2,319,894,963원 및 각 이에 대한 2006. 7. 25.부터 2009. 7. 16.까지는 연 5%, 그 다음 날부터 다 갚는 날까지는 연 20%의 각 비율에 의한 금원을 지급하라.&원고의 나머지 청구를 기각한다.&소송총비용 중 원고와 피고 000 사이에 생긴 부분은 그 중 3÷4은 원고가, 나머지는 위 피고가 부담하고,원고와 피고 000 사이에 생긴 부분은 그 중 1÷2은 원고가, 나머지는 위 피고가 각 부담한다.&위 제1의 가.항은 가집행할 수 있다.",
			"이 법원이 이 부분에 관하여 설시할 이유는, 제1심 판결문 제7면 제6행의 \"별지 부지별 내역표\"를 \"별지 청구 내역표\"로 고쳐 쓰는 이외에는 제1심 판결 이유 해당 부분 기재와 같으므로, 민사소송법 제420조 본문에 의하여 이를 그대로 인용한다. &피고 000이 이 사건 매매부지 상에서 약 20년간 주물제조공장을 운영한 점에 비추어 이 사건 매매부지가 유류 등으로 오염된 것은 위 피고의 행위로 인한 것으로 인정된다. &피고는 000에 도급주어 위 주물제조공장을철거하고 매립공사를 시행함에 있어 이 사건 매매부지 지하에 있는 공동구 등 지하 시설물을 그대로 둔 채 지상의 건물만을 철거하고 폐콘크리트 등 건설폐기물을 지하에 매립한 다음 복토하여 이를 피고 000자동차와 000에게 1/2 지분씩 매도하였다. &원고는 그러한 사정을 모른 채 피고 000로부터 1/2 지분을, 000의 지분을 매수한 000으로부터 나머지 2분의1 지분을 각 매수하였다가 그 지하부분을 이용하기 위하여 토양환경평가를 실시하는 과정에 위와 같은 사실을 발견하고 이를 처리하기 위하여 앞서 본 바와 같은 된다 지출하였거나 지출하여야 하는 사실이 인정된다.&원고 000가 1993. 12. 21. 이 사건 매매부지 중 1/2 지분을 매수할 당시 피고 000은 이미 이 사건부지에서 주물공장 운영을 종료하였던 점이 인정된다. &000이 1993. 8. 27. 피고 000로부터 이 사건 매매 부지에 있던 주물제조공장 철거 및 매립공사를 도급받아 공사를 실시하면서 이 사건 부지 지하의 공동구 등 시설물들을 그대로 둔 상태에서 지상의 건물만을 철거하고 폐콘크리트 등 건설폐기물을 지하에 매립한 것과 관련하여 피고 000자동차가 이에 가담한 것은 아닌 점이 인정된다. &원고는 종합건설업 등을 하는 회사로 지하철 2호선 0역 주변 00000 상가 신축 및 분양업을 시행한 회사로서 이 사건 부지를 매수한 것 역시 00000의 신축 및 분양을 위한 것이었으며, 피고 000 역시 이러한 사정을 알고 있었다고 보이는 점이 인정된다.&원고와 피고 000가 이 사건 매매 부지에 관한 매매계약을 체결하면서 본 매매목적물에 대하여 발생한 수익과비용은 잔금지급기일과 소유권이전등기 경료일 중 먼저 도래된 일자를 기준으로 하여 그 이전의 것은 피고 000에게, 그이후의 것은 원고에게 각각 귀속한다(매매계약서 제5조). 라고 약정한 사실을 인정된다. &이 사건 매매 부지는 자동차 출하장으로 사용되던 곳으로 대부분 아스팔트콘크리트가 깔려 있던 점이 인정된다. &오염토와 폐기물은 그 유형에 따라 법적 규제 및 처리 비용이 다르고, 그 규모에 따라 소요되는 제거 비용이 수십억 원 이상이 될 수도 있으며, 이 사건에서도 매매 대금 피고 000 지분(1/2)이 24,500,000,000원인데, 이 사건 부지의 오염토및 폐기물 등의 처리에 들어간 비용 및 앞으로 지출하여야 할 것으로 보이는 비용의 합계액이 10,879,199,388원에 달하는 점이 인정된다.&배상액 산정시에는 정확히 계산된 각 수치에 따른다)이 서로 다르다. 원고는 이 사건 청구를 함에 있어 건축물 부지를 제외한 나머지 부지의 간접공사비를 산정함에 있어서 원고와 000 사이에 적용된 위 비율에 따르고 있다. &원고와 000이 건축물 부지에 관한 도급계약을 체결할 당시와 달리 원고와 000가 도로 부지 및 공원 부지에 관한 도급계약을 체결할 당시에는 2005. 6. 30. 신설된 토양정화업의 등록요건에 관한 규정(토양환경보전법 시행령 제17조의 4) 등에 따라 토양정화업자가 정화 시설, 장비, 기술인력 및정화시설을 설치할 부지를 보유하여야 하게 됨으로써 오염토 및 폐기물 등 처리 단가가 상승하게 된 점이 인정된다.&공장용지로 사용되던 토지는 상가 신축 및 분양에 적합한 대지로 사용되던 토지 등에 비하여 건물 신축을 위한 지하 굴착 등을 하는 과정 및 지하층에서 발생되는 물질 등으로 인하여 일정 정도 비용이 더 소요될 가능성이 있는 점이 인정된다. &민사소송법 제349조에 의하여 원고와 000 사이의 매매계약서에는 이 사건 매매부지에 대한 오염 및 폐기물 매립과 관련하여 000의 책임을면하는 취지의 조항이 있는 것으로 인정할 수 있다. ",
			"자신이 소유하는 토지를 오염시키거나 거기에 폐기물을 불법 매립하여 행정법규를 위반하였다 하더라도 그로 인하여 타인의 법익을 침해하지 않는 한 민사상 불법행위가 성립할 여지는 없다.&환경오염행위를 한 토지 소유자가 토양환경보전법이나 폐기물관리법 등에 따라 오염된 토양을 정화시킨다.&그리고 폐기물을 적정하게 처리하지 않은 채 오히려 그 토지 위를 복토를 하는 등의 방법으로 외관상 정상적인 토지인 것처럼 보이게한 다음 이를 매도하여 유통시킨다면 외부에서 쉽게 알 수 없는 토지 지하에 존재하는 위와 같은 하자의 특성으로 인하여 유통과정에서 그 토지의 소유권을 취득하는 사람은 하자의 존재를 모른 채 취득가액에 이를 반영함이 없이 취득할 가능성이 많다.&그가 하자를 발견하고 행정법규상의 의무이행으로서 또는 자신의 토지 사용상의 필요에 의하여 이를 제거하려면 환경관련 법령이 정하는 바에 따라 적정하게 처리하여야 하므로 그 토지의 효용가치 감소 정도를 초과하는 다대한 비용이 소요되어 불측의 손해를 입게 된다.&이러한 사정은 오염행위를 한 토지 소유자가 이를 숨기고 그 토지를 유통시킬 때 충분히 예측할 수 있는 일로서 토지 소유자의위와 같은 행위는 토지거래의 안전을 해치고, 장차 그 토지를 취득하려는 사람의 신뢰를 저버리는 행위이다.&결함 있는 제조물을 제작하여 유통시키는 행위와 다를 바 없이 위법한 행위로 평가함이 마땅하다. &이러한 불법행위는 위법행위와 그로 인한 손해의 발생 사이에 시간적 간격이 있는 불법행위로서 단지 관념적이고 부동적인 상태에서 잠재적으로만 존재하던 손해가 그 후 현실화되었다고 볼 수 있을 때, 즉 토지 취득자가 오염사실을 발견하고 이를 제거하여야 할 때 완성된다고 보아야 할 것이다. &인정사실만으로는 원고가 이 사건 매매계약 체결 당시 피고 000와 사이에 장래 발생할 가능성이 있는 일체의 오염토 및 폐기물 등 처리비용을 부담하기로 합의하였다고 인정하기에 부족하고, 달리 이를 인정할 증거가 없다. &위 매매계약서 제5조에서의 비용 은 장래 발생할 가능성이 있는 일체의 오염토 및 폐기물 등 처리 비용을 의미하는 것이 아니라 이 사건 매매 부지상의 아스팔트콘크리트 제거 비용 등 매매계약 체결 당시 발생 가능성을 충분히 예상할수 있었던 부분과 관련한 비용을 의미한다고 봄이 상당하다.&상인간 채무불이행에 따른 손해배상청구권의 소멸시효는 5년이라 할 것이므로, 위 피고의 이 부분 주장은 더 나아가 살필 필요 없이 이유 없다. &처리 단가의 상승 등으로인하여 증가한 비용 상당의 손해는 민법 제393조 제2항에서 말하는 특별한 사정으로 인한 손해 라 할 것이다.&피고 000가 그와 같은 사정을 알았거나 알 수 있었다고 인정할 만한 아무런 자료가 없으므로, 건축물 부지를 제외한 나머지 부지에 대하여 오염토 및 폐기물 처리 공사비용 000 단가에 따른 비용을 초과하여 구하는 원고의 청구는 이유 없다. &건축물 부지의 공사 결과 등을 고려할 때, 원고에게도 건축물 부지의 공사 시점으로부터 22개월 이상이 지나서야 도로 등 부지의 공사를 함으로써 결과적으로 손해를 확대시킨 점 등 그 잘못이 없다 할 수 없고, 그 점을 고려하여 위 손해 중 상당 부분을 감액하여야 할 것이라는 점에 비추어 보면, 그 결론은 다를 바 없다. &이 사건 각 공사비는 직접공사비와 간접공사비로 구성되는데, 간접공사비는 직접공사비의 일정 비율에 해당하는 금원으로서계약 당사자에 따라 산정 방법이 달라지는바, 이 사건에서도 원고와 000 사이에 적용된 오염토 등 비율(약 4.7%)과 원고와 재민씨앤씨 사이에 적용된 오염토 등 비율(약 11.3%) 및 원고가 주장하는 기초공사비율(약 14.0%, 단, 여기에서의‘4.7%’, ‘11.3%’, ‘14%’는 개략적인 것이다.&이 사건에서는 원고와 000 사이의 계약 내용에 따라 손해를 인정하게 되므로, 오염토 및 폐기물 처리 공사에 대하여는 일률적으로 오염토 등 비율을 적용함이 상당하고, 다만, 원고가 스스로 공제를 주장하는 기초공사에 대하여는 원고의 주장에 따른 기초공사비율을 적용하기로 한다. &피고 000이 배상할 손해액은 건축물 부지와 관련한 4,707,516,042원, 도로 및 공원 부지와 관련한 1,194,645,312원, 사업제외부지와 관련한 794,182,586원 합계 6,696,343,940원(4,707,516,042원 +1,194,645,312원 + 794,182,586원)이 되고, 피고 000가 배상할 손해액은 그 중 2분의1에 해당하는 3,348,171,970원이 된다.&원고와 피고 000가 이 사건 매매계약 체결 당시 위와 같이 합의한 사실(매매계약서 제5조 해석)은 앞에서 본 바와 같고, 피고 000이 자동차 출하장 조성공사와 무관한 점은 위에서 본 바와 같으므로, 위에서 인정된 손해액 중 폐아스콘 처리비용에 해당하는 부분은 공제되어야 한다. &피고 000에 대하여 공제되어야 할 폐아스콘 처리비용은 이 사건 매매부지의 폐아스콘 처리비용이고, 피고 000에 대하여 공제되어야 할 폐아스콘 처리비용은 이 사건 매매부지의 폐아스콘 처리비용의 2분의1에 해당하는 금액이다.&따라서, 위 공제금을 제외한 피고 000이 배상할 손해액은 6,628,271,324원(6,696,343,940원 - 68,072,616원)이고, 피고 000가 배상할 손해액은 3,314,135,662원(3,348,171,970원 - 34,036,308원)이 된다. &건설폐기물의 재활용촉진에 관한 법률에 따르면, 발주자는 당해 건설 공사에서 발생되는 건설폐기물의 분리배출, 보관, 처리 및 재활용 등에 필요한 비용을 공사금액에 계상하여야 하고(위 법률 제5조 제2항), 여기에서의 건설폐기물에는 건설폐토석(건설 공사에 발생되거나 건설폐기물을 중간처리하는 과정에서 발생된 흙, 모래, 자갈 등으로서 자연상태의 것을 제외한 것을 말한다)이 포함된다. &위 법률 제2조 제1호, 동 시행령 제2조 별표 1 제16호, 원고가 이 사건 오염토 및 폐기물 등의 처리를 한 시점을 전후하여 별표 1의 내용이 개정되었으나, 건설폐토석 의 의미에는 변함이 없다.&원고로서는이 사건 폐토사의 처리를 위한 비용을 지출하지 않을 수 없다 할 것이므로, 위 피고의 이 부분 주장은 이유 없다. &농업기반공사의 기초 조사 및 정밀 조사 결과에서 산출한 물량과 이사건 부지에서 오염토 및 폐기물 등 처리 공사를 통해 실제로 반출된 물량의 양이 크게 다르지 아니하고, 오염토와 폐토사간의 비중의 차이는 해당 부지의 특성(주물 공장 시설의 종류 등)에 따른 것이다.&오염토 및 폐기물 등의 반출은 기본적으로토양오염 정밀조사에 의해 작성된 오염 지도에 따르면서 굴착시 오염이 의심될 경우 시료 채취 및 분석을 통하여 오염 여부를 판정한 점 등을 고려할 때, 원고의 오염토 및 폐기물 등의 물량 산정은 적정하다고 볼 수 있으므로, 피고들의 이 부분 주장은 이유없다. &감정인은 000협회의 폐기물 성상별 TON 당 처리단가, 사단법인 한국물가정보의 적산 정보, 미 환경보호청(EPA)의 오염토양 복원처리기술별 처리비용, 국내외 논문에 제시된 처리비용, 오염토양정화업체의 견적서 등의 자료를 바탕으로 도급 계약상의 비용 산정이 타당하다고 판단하였다. &원고와 000 사이의 오염토 및 폐기물 등 처리 공사 도급 계약상의 비용산정은 적정하다고 볼 수 있으므로, 피고들의 이 부분 주장도 이유 없다. &원고는 종합건설업등을 하는 회사로 지하철 2호선 0역 주변 00000 상가 신축 및 분양업을 시행한 회사로서 0000 00000의 신축 및분양을 위하여 이 사건 부지를 매수하면서 이 사건 부지에서 오랜 기간 주물공장이 운영되었다는 사실을 알고 있었던 점이 인정된다. &그럼에도 원고는 공장용지로 사용되던 이 사건 부지를 상가 신축 및 분양을 위한 택지로 사용하기 위하여 매수하면서 토양 오염 또는 폐기물 매립 등으로 인한 피해조사 등을 하지 아니한 채 만연히 이를 매수한 점이 인정된다.&피고들은 원고가 000으로부터 이 사건 매매부지 중 1/2지분을 매수할 당시 작성한 매매계약서에 이 사건 매매부지에 대한 오염 및 폐기물 매립과 관련하여 000의 면책을 규정한 조항이 있다고 주장하며 그 매매계약서에 대한 문서제출명령을 신청하였다.&그리고 이 법원이 이를 받아들여 원고에게 그 문서의제출을 명하였으나 원고가 이를 거부하였다(원고는 000과의 비밀준수의무를 내세워 문서제출을 거부하였으나그런 사유는 민사소송법 제344조가 규정한 문서제출의무를 면제할 사유에 해당하지 아니한다).&원고가 피고 000로부터 이 사건 매매부지 중 1/2 지분을 매수할 당시에도 이 사건 매매부지에 대한 오염 및 폐기물 매립 가능성을 의심할 수 있었을 것으로 보인다. &그럼에도 불구하고 이에 대비한 아무런 조치도 취함이 없이 이 사건 매매부지를 매수한 점, 원고가 이사건 부지 매입을 한 직후 2002. 4.경 000를 통하여 이 사건 부지에 관한 지반조사를 실시하여 이 사건 부지의지하 현황을 파악했다.&그럼에도 2년 이상 경과된 2005. 3.경에서야 이 사건 오염토 및 폐기물 등 처리공사를 한 점 등을 참작하면, 피고들의 원고에 대한 손해배상책임은 손해액의 70%로 제한함이 손해부담의 공평이라는 손해배상제도의 이념에 비추어 상당하다고 할 것이다. ",
			"제1심 판결을 다음과 같이 변경한다.&원고에게, 피고 000은 4,639,789,926원, 피고 000는 피고 000과 각자 위 금원 중 2,319,894,963원 및 각 이에 대한 2006. 7. 25.부터 2009. 7. 16.까지는 연 5%, 그 다음 날부터 다 갚는 날까지는 연 20%의 각 비율에 의한 금원을 지급하라.&소송총비용 중 원고와 피고 000 사이에 생긴 부분은 그 중 3/4은 원고가, 나머지는 위 피고가 부담하고, 원고와 피고 000 사이에 생긴 부분은 그 중 1/2은 원고가, 나머지는 위 피고가 각 부담한다.&위 제1의 가.항은 가집행할 수 있다."
		);
	}
}
