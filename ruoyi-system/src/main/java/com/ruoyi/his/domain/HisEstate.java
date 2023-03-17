package com.ruoyi.his.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class HisEstate extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /** 物业序号 */
    @Excel(name = "物业序号", cellType = Excel.ColumnType.NUMERIC)
    private Long estateId;

    /** 物业编码 */
    @Excel(name = "物业编码")
    private String estateCode;

    /** 物业名称 */
    @Excel(name = "物业名称")
    private String estateName;

    /** 物业排序 */
    @Excel(name = "物业排序")
    private Integer estateSort;

    /** 状态（0已完成 1停用） */
    @Excel(name = "状态", readConverterExp = "0=已完成,1=停用")
    private String status;

    /** 用户是否存在此物业标识 默认不存在 */
    private boolean flag = false;

    public Long getestateId()
    {
        return estateId;
    }

    public void setestateId(Long estateId)
    {
        this.estateId = estateId;
    }

    @NotBlank(message = "物业编码不能为空")
    @Size(min = 0, max = 64, message = "物业编码长度不能超过64个字符")
    public String getestateCode()
    {
        return estateCode;
    }

    public void setestateCode(String estateCode)
    {
        this.estateCode = estateCode;
    }

    @NotBlank(message = "物业名称不能为空")
    @Size(min = 0, max = 50, message = "物业名称长度不能超过50个字符")
    public String getestateName()
    {
        return estateName;
    }

    public void setestateName(String estateName)
    {
        this.estateName = estateName;
    }

    @NotNull(message = "显示顺序不能为空")
    public Integer getestateSort()
    {
        return estateSort;
    }

    public void setestateSort(Integer estateSort)
    {
        this.estateSort = estateSort;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public boolean isFlag()
    {
        return flag;
    }

    public void setFlag(boolean flag)
    {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("estateId", getestateId())
                .append("estateCode", getestateCode())
                .append("estateName", getestateName())
                .append("estateSort", getestateSort())
                .append("status", getStatus())
                .append("createBy", getCreateBy())
                .append("createTime", getCreateTime())
                .append("updateBy", getUpdateBy())
                .append("updateTime", getUpdateTime())
                .append("remark", getRemark())
                .toString();
    }
}
